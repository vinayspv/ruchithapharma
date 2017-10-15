package com.pharma.util;

import java.util.Calendar;
import java.util.Date;

public class CommonUtilities
{

    public static String convertCaltoString ( Date date )
    {
        String dateStr = null;
        if ( date != null )
        {
            Calendar cal = Calendar.getInstance ( );
            cal.setTime ( date );
            System.out.println ( cal.get ( Calendar.YEAR ) + "-" + ( cal.get ( Calendar.MONTH ) + 1 ) + "-" +
                cal.get ( Calendar.DATE ) );
            dateStr =
                cal.get ( Calendar.YEAR ) + "-" + ( cal.get ( Calendar.MONTH ) + 1 ) + "-" + cal.get ( Calendar.DATE );
        }

        return dateStr;
    }

    public static String getCurrentDateAsString ( )
    {
        String dateStr = null;
        Calendar cal = Calendar.getInstance ( );
        dateStr =
            cal.get ( Calendar.YEAR ) + "-" + ( cal.get ( Calendar.MONTH ) + 1 ) + "-" + cal.get ( Calendar.DATE );

        return dateStr;
    }

}
