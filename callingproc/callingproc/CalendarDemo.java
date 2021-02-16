//<applet code="CalendarDemo.class" width=500 height=330></applet>
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.applet.*;

public class CalendarDemo extends Applet implements ActionListener
 {
   Monthly ins = null;
   TextField text = null;

   public void init()
     {
       this.setBackground(Color.lightGray);
       ins = new Monthly(getSize());
       text = new TextField(20);
       Label bb2 = new Label("Enter the month/year (MM/YYYY)");
       Panel shortPanel = new Panel();

       text.addActionListener(this);
       shortPanel.setLayout(new FlowLayout());
       shortPanel.add(text);
       shortPanel.add(bb2);

       setLayout(new BorderLayout());

       add(ins,BorderLayout.CENTER);
       add(shortPanel,BorderLayout.SOUTH);
     }

public void actionPerformed(ActionEvent event)
{
   ins.setEntry("01/"+text.getText().trim() ) ;
   text.setText("");
   ins.repaint();
   repaint();
}

public String getAppletInfo()
 {
   StringBuffer s = new StringBuffer();
   s.append("Choose your Calendar\n");
   s.append((char) 169);
   s.append("by Neri Llosa (nerill@aol.com), All Rights Reserved\n");
   return s.toString();
  }
}

class Monthly extends Panel
 {
   private final String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"} ;
   private final String[] months = {"January","February","March",
                                    "April","May","June","July","August","September","October",
                                    "November","December"} ;

   private int x=0;
   private int y=0;
   private GregorianCalendar calendar = null;
   private String entry = null;
   private Date dina=null;

   public Monthly(Dimension d)
    {
       setSize(new Dimension(d.width,d.height-60));
     }

   public void setEntry(String entry)
    {
      this.entry=entry;
     }

   public Point nextPoint(int x, int y)
    {
       int j = getSize().width/8;
       int z = y ;
       int w = x + j;

       if (w >(7*j))
        {
          w=j/2; z+=35;
         }
       return new Point(w,z);
     }

   public void paint(Graphics g)
    {
      int y = getSize().width/8;

      try
       {
         if (dina==null){
         dina = new Date();
         calendar = new GregorianCalendar();
         calendar.setTime(dina);
         int mmm = calendar.get(Calendar.MONTH) ;
         int yyy = calendar.get(Calendar.YEAR) ;
         entry = "01/"+(mmm+1)+"/"+yyy;
        }

        dina = DateFormat.getDateInstance
        (DateFormat.SHORT,Locale.FRANCE).parse(entry);
        calendar = new GregorianCalendar();
        calendar.setTime(dina);
     }
     catch(ParseException e)
      {
         System.out.println(e);
       };

      int mm = calendar.get(Calendar.MONTH) ;
      int yy = calendar.get(Calendar.YEAR) ;
      int pp = calendar.get(Calendar.DAY_OF_WEEK) ;

      String title = "Calendar for "+months[mm]+" "+yy;
      Font font = new Font("Serif",Font.BOLD+Font.ITALIC,22);
      g.setFont(font);
      g.setColor(Color.blue);
      FontMetrics metrics = getFontMetrics(font);

      g.drawString(title,(getSize().width-metrics.stringWidth(title))/2,25);

      g.setFont(new Font("Serif",Font.BOLD,18));
      g.setColor(Color.red);
      for(int i=0,z=y/2; i<7;i++,z+=y)
       {
         g.drawString(days[i],z,65);
        }

      int num;
      switch(mm)
       {
         case 0:
         case 2:
         case 4:
         case 6:
         case 7:
         case 9:
         case 11:
                  num=31;
                  break;
         case 1:
                 if((calendar.isLeapYear(yy))&&(yy%1000!=0))
                        num=29;
                 else
                        num=28;
                        break;
        default:
                 num=30;
      }

   Point[] points = new Point[num];
   g.setFont(new Font("Roman",Font.BOLD,20));
   g.setColor(Color.black);
   points[0]=new Point(y/2+((pp-1)*y),100);
   g.drawString("1",points[0].x,points[0].y);


   for(int i=0; i<points.length-1;i++)
    {
       points[i+1] = nextPoint(points[i].x,points[i].y);
       g.drawString(""+(i+2),points[i+1].x,points[i+1].y);
     }
  }
}
