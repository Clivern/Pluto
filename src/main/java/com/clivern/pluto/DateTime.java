/*
 * Copyright (c) 2017 Clivern. <https://clivern.com>. All rights reserved.
 */
package com.clivern.pluto;

/**
 * DateTime Class
 */
public class DateTime {

    private static DateTime instance;

    /**
     * Constructor
     */
    protected DateTime() { }

    /**
     * Get Instance
     *
     * @return DateTime
     */
    public static DateTime getInstance() {
        if(instance == null) {
            instance = new DateTime();
        }
        return instance;
    }
}