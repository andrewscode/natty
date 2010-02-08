// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g 2010-02-08 16:55:29
 package com.natty.parse; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "AM_PM", "WHITE_SPACE", "AT", "COMMA", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "THIS", "LAST", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "INT_0", "INT_00", "INT_1_TO_9", "INT_01_TO_12", "INT_13_TO_23", "INT_24_TO_31", "INT_32_TO_59", "INT_60_TO_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "DOT", "'s'"
    };
    public static final int DIRECTION=13;
    public static final int NINETEEN=100;
    public static final int WEEK=55;
    public static final int SEPTEMBER=37;
    public static final int WEDNESDAY=60;
    public static final int INT_24_TO_31=79;
    public static final int TWENTY_EIGHTH=130;
    public static final int TWENTY=101;
    public static final int INT_00=75;
    public static final int JULY=35;
    public static final int APRIL=32;
    public static final int COMING=50;
    public static final int NINETEENTH=121;
    public static final int OCTOBER=38;
    public static final int NOW=53;
    public static final int ONE=82;
    public static final int DAY=25;
    public static final int MIDNIGHT=73;
    public static final int MARCH=31;
    public static final int EOF=-1;
    public static final int MONTH=56;
    public static final int PAST=49;
    public static final int SEVENTEEN=98;
    public static final int DATE_TIME=9;
    public static final int AM_PM=19;
    public static final int TWENTY_SEVENTH=129;
    public static final int TWENTY_FIFTH=127;
    public static final int EIGHTEENTH=120;
    public static final int MINUTES_OF_HOUR=18;
    public static final int SPAN=15;
    public static final int THIS=46;
    public static final int NOON=72;
    public static final int THIRTIETH=132;
    public static final int INT_60_TO_99=81;
    public static final int LAST=47;
    public static final int EIGHTEEN=99;
    public static final int INT_01_TO_12=77;
    public static final int TOMORROW=65;
    public static final int RELATIVE_DATE=11;
    public static final int FOURTH=106;
    public static final int FIFTEENTH=117;
    public static final int TODAY=64;
    public static final int SECOND=104;
    public static final int NOVEMBER=39;
    public static final int SATURDAY=63;
    public static final int MONTH_OF_YEAR=5;
    public static final int FOUR=85;
    public static final int SEVENTH=109;
    public static final int TEN=91;
    public static final int FEBRUARY=30;
    public static final int ON=23;
    public static final int MONDAY=58;
    public static final int THIRTEEN=94;
    public static final int ELEVEN=92;
    public static final int DAY_OF_WEEK=7;
    public static final int SUNDAY=57;
    public static final int SEVEN=88;
    public static final int JUNE=34;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=10;
    public static final int OF=28;
    public static final int UPCOMING=51;
    public static final int SIX=87;
    public static final int FIFTH=107;
    public static final int TWENTY_NINTH=131;
    public static final int THURSDAY=61;
    public static final int DECEMBER=40;
    public static final int SEEK_BY=14;
    public static final int AUGUST=36;
    public static final int PM=71;
    public static final int EXPLICIT_TIME=16;
    public static final int FROM=52;
    public static final int TUESDAY=59;
    public static final int EIGHTH=110;
    public static final int T__135=135;
    public static final int THIRD=105;
    public static final int HOURS_OF_DAY=17;
    public static final int YEAR=43;
    public static final int THE=24;
    public static final int TENTH=112;
    public static final int MAY=33;
    public static final int TWENTY_FOURTH=126;
    public static final int WHITE_SPACE=20;
    public static final int FRIDAY=62;
    public static final int EIGHT=89;
    public static final int INT_0=74;
    public static final int TWENTY_SIXTH=128;
    public static final int AT=21;
    public static final int SINGLE_QUOTE=41;
    public static final int SLASH=45;
    public static final int IN=42;
    public static final int NINTH=111;
    public static final int COMMA=22;
    public static final int FIVE=86;
    public static final int THIRTY=102;
    public static final int TWENTIETH=122;
    public static final int TWENTY_SECOND=124;
    public static final int NEXT=48;
    public static final int INT_13_TO_23=78;
    public static final int DOT=134;
    public static final int MILITARY_HOUR_SUFFIX=68;
    public static final int INT_32_TO_59=80;
    public static final int AM=70;
    public static final int DASH=44;
    public static final int FOURTEENTH=116;
    public static final int INT_1_TO_9=76;
    public static final int SIXTEEN=97;
    public static final int YEAR_OF=8;
    public static final int TWELVE=93;
    public static final int AGO=54;
    public static final int ELEVENTH=113;
    public static final int BEFORE=27;
    public static final int TWO=83;
    public static final int AFTER=26;
    public static final int HOUR=69;
    public static final int SIXTEENTH=118;
    public static final int JANUARY=29;
    public static final int THIRTEENTH=115;
    public static final int SEEK=12;
    public static final int COLON=67;
    public static final int DAY_OF_MONTH=6;
    public static final int FIFTEEN=96;
    public static final int TWELFTH=114;
    public static final int NINE=90;
    public static final int SIXTH=108;
    public static final int THREE=84;
    public static final int TWENTY_FIRST=123;
    public static final int FOURTEEN=95;
    public static final int TWENTY_THIRD=125;
    public static final int YESTERDAY=66;
    public static final int SEVENTEENTH=119;
    public static final int FIRST=103;
    public static final int THIRTY_FIRST=133;

    // delegates
    // delegators


        public DateWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public DateWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DateWalker.tokenNames; }
    public String getGrammarFileName() { return "/Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g"; }


      SeekableDateTime parserState = new SeekableDateTime();
      
      public java.util.Date getDate() {
        return parserState.getDate(); 
      }



    // $ANTLR start "date_time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:1: date_time : ^( DATE_TIME ( date )? ( time )? ) ;
    public final void date_time() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:20:3: ( ^( DATE_TIME ( date )? ( time )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:20:5: ^( DATE_TIME ( date )? ( time )? )
            {
            match(input,DATE_TIME,FOLLOW_DATE_TIME_in_date_time49); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:20:17: ( date )?
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=EXPLICIT_DATE && LA1_0<=RELATIVE_DATE)) ) {
                    alt1=1;
                }
                switch (alt1) {
                    case 1 :
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:20:17: date
                        {
                        pushFollow(FOLLOW_date_in_date_time51);
                        date();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:20:23: ( time )?
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==EXPLICIT_TIME) ) {
                    alt2=1;
                }
                switch (alt2) {
                    case 1 :
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:20:23: time
                        {
                        pushFollow(FOLLOW_time_in_date_time54);
                        time();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "date_time"


    // $ANTLR start "date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:1: date : ( relative_date | explicit_date );
    public final void date() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:24:3: ( relative_date | explicit_date )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RELATIVE_DATE) ) {
                alt3=1;
            }
            else if ( (LA3_0==EXPLICIT_DATE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:24:5: relative_date
                    {
                    pushFollow(FOLLOW_relative_date_in_date73);
                    relative_date();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:25:5: explicit_date
                    {
                    pushFollow(FOLLOW_explicit_date_in_date79);
                    explicit_date();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "date"


    // $ANTLR start "relative_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:28:1: relative_date : ^( RELATIVE_DATE seek ) ;
    public final void relative_date() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:29:3: ( ^( RELATIVE_DATE seek ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:29:5: ^( RELATIVE_DATE seek )
            {
            match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date95); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_seek_in_relative_date97);
            seek();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relative_date"


    // $ANTLR start "relaxed_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:32:1: relaxed_date : ^( RELATIVE_DATE seek ) ;
    public final void relaxed_date() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:33:3: ( ^( RELATIVE_DATE seek ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:33:5: ^( RELATIVE_DATE seek )
            {
            match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relaxed_date114); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_seek_in_relaxed_date116);
            seek();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relaxed_date"


    // $ANTLR start "explicit_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:36:1: explicit_date : ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) ) );
    public final void explicit_date() throws RecognitionException {
        CommonTree month=null;
        CommonTree day=null;
        CommonTree year=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:37:3: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:37:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) )
                    {
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date133); 

                    match(input, Token.DOWN, null); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date136); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date140); 

                    match(input, Token.UP, null); 
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date144); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date148); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    parserState.setExplicitDate((month!=null?month.getText():null), (day!=null?day.getText():null), null);

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:40:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) )
                    {
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date168); 

                    match(input, Token.DOWN, null); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date171); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date175); 

                    match(input, Token.UP, null); 
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date179); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date183); 

                    match(input, Token.UP, null); 
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date187); 

                    match(input, Token.DOWN, null); 
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date191); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    parserState.setExplicitDate((month!=null?month.getText():null), (day!=null?day.getText():null), (year!=null?year.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicit_date"


    // $ANTLR start "time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:44:1: time : ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( AM_PM )? ) ;
    public final void time() throws RecognitionException {
        CommonTree hours=null;
        CommonTree minutes=null;
        CommonTree AM_PM1=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:45:3: ( ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( AM_PM )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:45:5: ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( AM_PM )? )
            {
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_time215); 

            match(input, Token.DOWN, null); 
            match(input,HOURS_OF_DAY,FOLLOW_HOURS_OF_DAY_in_time218); 

            match(input, Token.DOWN, null); 
            hours=(CommonTree)match(input,INT,FOLLOW_INT_in_time222); 

            match(input, Token.UP, null); 
            match(input,MINUTES_OF_HOUR,FOLLOW_MINUTES_OF_HOUR_in_time226); 

            match(input, Token.DOWN, null); 
            minutes=(CommonTree)match(input,INT,FOLLOW_INT_in_time230); 

            match(input, Token.UP, null); 
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:45:78: ( AM_PM )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==AM_PM) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:45:78: AM_PM
                    {
                    AM_PM1=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_time233); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            parserState.setExplicitTime((hours!=null?hours.getText():null), (minutes!=null?minutes.getText():null), (AM_PM1!=null?AM_PM1.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "time"


    // $ANTLR start "seek"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:49:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );
    public final void seek() throws RecognitionException {
        CommonTree by=null;
        CommonTree amount=null;
        CommonTree day=null;
        CommonTree month=null;
        CommonTree DIRECTION2=null;
        CommonTree DIRECTION3=null;
        CommonTree DIRECTION4=null;
        CommonTree INT5=null;
        CommonTree SPAN6=null;
        CommonTree DIRECTION7=null;
        CommonTree INT8=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:50:3: ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:50:5: ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek257); 

                    match(input, Token.DOWN, null); 
                    DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek259); 
                    by=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek263); 
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek267); 
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_seek270); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_seek274); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    parserState.seekToDayOfWeek((DIRECTION2!=null?DIRECTION2.getText():null), (by!=null?by.getText():null), (amount!=null?amount.getText():null), (day!=null?day.getText():null));

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:53:5: ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek294); 

                    match(input, Token.DOWN, null); 
                    DIRECTION3=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek296); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek298); 
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek302); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_seek305); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_seek309); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    parserState.seekToMonth((DIRECTION3!=null?DIRECTION3.getText():null), (amount!=null?amount.getText():null), (month!=null?month.getText():null));

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:56:5: ^( SEEK DIRECTION SEEK_BY INT SPAN )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek327); 

                    match(input, Token.DOWN, null); 
                    DIRECTION4=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek329); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek331); 
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_seek333); 
                    SPAN6=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_seek335); 

                    match(input, Token.UP, null); 
                    parserState.seekBySpan((DIRECTION4!=null?DIRECTION4.getText():null), (INT5!=null?INT5.getText():null), (SPAN6!=null?SPAN6.getText():null));

                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:59:5: ^( SEEK DIRECTION SEEK_BY INT date )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek352); 

                    match(input, Token.DOWN, null); 
                    DIRECTION7=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek354); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek356); 
                    INT8=(CommonTree)match(input,INT,FOLLOW_INT_in_seek358); 
                    pushFollow(FOLLOW_date_in_seek360);
                    date();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    parserState.seekBySpan((DIRECTION7!=null?DIRECTION7.getText():null), (INT8!=null?INT8.getText():null), "day");

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "seek"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\1\12\1\2\1\5\1\2\1\4\1\3\1\6\1\2\1\4\2\3\2\uffff";
    static final String DFA4_maxS =
        "\1\12\1\2\1\5\1\2\1\4\1\3\1\6\1\2\1\4\1\3\1\10\2\uffff";
    static final String DFA4_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13\4\uffff\1\14",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "36:1: explicit_date : ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\14\1\2\1\15\1\16\1\4\1\5\4\uffff";
    static final String DFA6_maxS =
        "\1\14\1\2\1\15\1\16\1\4\1\17\4\uffff";
    static final String DFA6_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\7\1\uffff\1\6\2\uffff\2\11\3\uffff\1\10",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "49:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );";
        }
    }
 

    public static final BitSet FOLLOW_DATE_TIME_in_date_time49 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_in_date_time51 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_time_in_date_time54 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relative_date_in_date73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seek_in_relative_date97 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relaxed_date114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seek_in_relaxed_date116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date183 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_date187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_TIME_in_time215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOURS_OF_DAY_in_time218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_OF_HOUR_in_time226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AM_PM_in_time233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek259 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek267 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_seek270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek296 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_seek305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek329 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek333 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SPAN_in_seek335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek354 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek358 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_date_in_seek360 = new BitSet(new long[]{0x0000000000000008L});

}