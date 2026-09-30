package o;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import o.MaterialThemeKtExternalSyntheticLambda1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MaterialTheme_androidKtExternalSyntheticLambda0 {
    private static final String[] onExtraCallbackWithResult = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] onWarmupCompleted = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] IAuthTabCallback = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static MaterialThemeKtExternalSyntheticLambda1 onExtraCallbackWithResult(String str) throws IOException {
        try {
            return onExtraCallback(str);
        } catch (XmlPullParserException | ParserException | NumberFormatException unused) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static MaterialThemeKtExternalSyntheticLambda1 onExtraCallback(String str) throws XmlPullParserException, ParserException, IOException, NumberFormatException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onWarmupCompleted(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.onNavigationEvent("Couldn't find xmp metadata", (Throwable) null);
        }
        ImmutableList<MaterialThemeKtExternalSyntheticLambda1.onWarmupCompleted> immutableListOf = ImmutableList.of();
        long jOnNavigationEvent = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onWarmupCompleted(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!onWarmupCompleted(xmlPullParserNewPullParser)) {
                    return null;
                }
                jOnNavigationEvent = onNavigationEvent(xmlPullParserNewPullParser);
                immutableListOf = IAuthTabCallback(xmlPullParserNewPullParser);
            } else if (TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onWarmupCompleted(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListOf = onNavigationEvent(xmlPullParserNewPullParser, "Container", "Item");
            } else if (TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onWarmupCompleted(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListOf = onNavigationEvent(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!TextFieldDecoratorModifierNodeExternalSyntheticLambda5.IAuthTabCallback(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListOf.isEmpty()) {
            return null;
        }
        return new MaterialThemeKtExternalSyntheticLambda1(jOnNavigationEvent, immutableListOf);
    }

    private static boolean onWarmupCompleted(XmlPullParser xmlPullParser) {
        for (String str : onExtraCallbackWithResult) {
            String strOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, str);
            if (strOnNavigationEvent != null) {
                return Integer.parseInt(strOnNavigationEvent) == 1;
            }
        }
        return false;
    }

    private static long onNavigationEvent(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : onWarmupCompleted) {
            String strOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, str);
            if (strOnNavigationEvent != null) {
                long j = Long.parseLong(strOnNavigationEvent);
                if (j == -1) {
                    return -9223372036854775807L;
                }
                return j;
            }
        }
        return -9223372036854775807L;
    }

    private static ImmutableList<MaterialThemeKtExternalSyntheticLambda1.onWarmupCompleted> IAuthTabCallback(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : IAuthTabCallback) {
            String strOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, str);
            if (strOnNavigationEvent != null) {
                return ImmutableList.of(new MaterialThemeKtExternalSyntheticLambda1.onWarmupCompleted("image/jpeg", "Primary", 0L, 0L), new MaterialThemeKtExternalSyntheticLambda1.onWarmupCompleted("video/mp4", "MotionPhoto", Long.parseLong(strOnNavigationEvent), 0L));
            }
        }
        return ImmutableList.of();
    }

    private static ImmutableList<MaterialThemeKtExternalSyntheticLambda1.onWarmupCompleted> onNavigationEvent(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.Builder builder = ImmutableList.builder();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onWarmupCompleted(xmlPullParser, str3)) {
                String strOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, str2 + ":Mime");
                String strOnNavigationEvent2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, str2 + ":Semantic");
                String strOnNavigationEvent3 = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, str2 + ":Length");
                String strOnNavigationEvent4 = TextFieldDecoratorModifierNodeExternalSyntheticLambda5.onNavigationEvent(xmlPullParser, str2 + ":Padding");
                if (strOnNavigationEvent == null || strOnNavigationEvent2 == null) {
                    return ImmutableList.of();
                }
                builder.add(new MaterialThemeKtExternalSyntheticLambda1.onWarmupCompleted(strOnNavigationEvent, strOnNavigationEvent2, strOnNavigationEvent3 != null ? Long.parseLong(strOnNavigationEvent3) : 0L, strOnNavigationEvent4 != null ? Long.parseLong(strOnNavigationEvent4) : 0L));
            }
        } while (!TextFieldDecoratorModifierNodeExternalSyntheticLambda5.IAuthTabCallback(xmlPullParser, str4));
        return builder.build();
    }
}
