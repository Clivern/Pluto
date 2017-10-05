/*
 * Copyright (c) 2017 Clivern. <https://clivern.com>. All rights reserved.
 */

package com.clivern.pluto;

import junit.framework.TestCase;

public class DateTimeTest extends TestCase {

    public void testGetName()
    {
        DateTime dateTime = new DateTime();
        assertEquals(dateTime.getName(), "Pluto");
    }
}