package com.patel.viraj.prestotechtest;

import android.support.v4.view.ViewPager;

import com.patel.viraj.prestotechtest.Model.SockModel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class PrestoTechScreenUnitTest {
    @Test
    public void test() throws Exception {
        SockModel s = new SockModel();
        assertEquals(9, s.sockParser("1/blue/right,2/blue/right,3/red/right,4/blue/left,5/purple/left,6/red/left,7/green/left,8/red/left,9/blue/left").size());
        assertEquals(0, s.sockParser("").size());
        assertEquals(0, s.sockParser(null).size());

        assertEquals("1 4\n3 6\n2 9\n", s.sockSeparator(s.sockParser("1/blue/right,2/blue/right,3/red/right,4/blue/left,5/purple/left,6/red/left,7/green/left,8/red/left,9/blue/left")));
        assertEquals("3 1 5 2", s.oppositeSockSeparator(s.sockParser("1/blue/right,2/blue/right,3/red/right,4/blue/left,5/purple/left,6/red/left,7/green/left,8/red/left,9/blue/left")));
    }
}