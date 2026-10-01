package o;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda5 {
    public static boolean IAuthTabCallback(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return IAuthTabCallback(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean IAuthTabCallback(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean onWarmupCompleted(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return onExtraCallback(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean onExtraCallback(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static String onNavigationEvent(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }
}
