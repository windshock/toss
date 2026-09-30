package com.initech.inisafesign.util;

import com.initech.inibase.logger.Logger;
import com.initech.inibase.logger.helpers.FileWatchdog;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PropertyConfigurator {
    private static Properties a;
    private Logger b = Logger.getLogger(PropertyConfigurator.class);

    public static void configure(String str) throws IOException {
        new PropertyConfigurator().doConfigure(str);
        initialize(str);
    }

    public static void configure(URL url) throws IOException {
        new PropertyConfigurator().doConfigure(url);
    }

    public static void configure(Properties properties) {
        new PropertyConfigurator().doConfigure(properties);
    }

    public static void initialize(String str) {
        com.initech.inibase.logger.PropertyConfigurator.configure(str);
    }

    public static void configureAndWatch(String str) {
        configureAndWatch(str, FileWatchdog.DEFAULT_DELAY);
    }

    public static void configureAndWatch(String str, long j) {
        PropertyWatchdog propertyWatchdog = new PropertyWatchdog(str);
        propertyWatchdog.setDelay(j);
        propertyWatchdog.start();
    }

    public void doConfigure(String str) throws IOException {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            properties.load(fileInputStream);
            fileInputStream.close();
            doConfigure(properties);
        } catch (IOException e) {
            this.b.error("Could not read configuration file [" + str + "].", e);
            this.b.error("Ignoring configuration file [" + str + "].");
        }
    }

    public void doConfigure(URL url) throws IOException {
        Properties properties = new Properties();
        try {
            properties.load(url.openStream());
            doConfigure(properties);
        } catch (IOException e) {
            this.b.error("Could not read configuration file from URL [" + url + "].", e);
            this.b.error("Ignoring configuration file [" + url + "].");
        }
    }

    public void doConfigure(Properties properties) {
        a = new Properties(properties);
    }

    public static String get(String str) {
        return a.getProperty(str);
    }

    public static Properties getProperties() {
        return a;
    }

    public static void main(String[] strArr) throws InterruptedException, IOException {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("D:/Java/working/test.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException unused) {
            System.out.println("Exception!!!!!!");
        }
        configure("D:/Java/working/test.properties");
        System.out.println("Property Value = " + get("test"));
        System.out.println("Property Value = " + get("number"));
        try {
            Thread.sleep(120000L);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException ===" + e.getMessage());
        }
        System.out.println("==========   PropertyConfigurator 사용시  =============");
        System.out.println("PropertyConfigurator = " + get("test"));
        System.out.println("PropertyConfigurator = " + get("number"));
        System.out.println("==========   일반 Properties 사용시  =============");
        System.out.println("Properties = " + properties.getProperty("test"));
        System.out.println("Properties = " + properties.getProperty("number"));
    }
}
