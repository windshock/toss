package o;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.RubySpan;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;
import o.SliderKtExternalSyntheticLambda15;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda15 {
    private static final Map<String, Integer> IAuthTabCallback;
    private static final Map<String, Integer> onNavigationEvent;
    public static final Pattern onExtraCallbackWithResult = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern onWarmupCompleted = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(OggPageHeader.MAX_SEGMENT_COUNT, OggPageHeader.MAX_SEGMENT_COUNT, OggPageHeader.MAX_SEGMENT_COUNT)));
        map.put("lime", Integer.valueOf(Color.rgb(0, OggPageHeader.MAX_SEGMENT_COUNT, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, OggPageHeader.MAX_SEGMENT_COUNT, OggPageHeader.MAX_SEGMENT_COUNT)));
        map.put("red", Integer.valueOf(Color.rgb(OggPageHeader.MAX_SEGMENT_COUNT, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(OggPageHeader.MAX_SEGMENT_COUNT, OggPageHeader.MAX_SEGMENT_COUNT, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(OggPageHeader.MAX_SEGMENT_COUNT, 0, OggPageHeader.MAX_SEGMENT_COUNT)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, OggPageHeader.MAX_SEGMENT_COUNT)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        onNavigationEvent = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(OggPageHeader.MAX_SEGMENT_COUNT, OggPageHeader.MAX_SEGMENT_COUNT, OggPageHeader.MAX_SEGMENT_COUNT)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, OggPageHeader.MAX_SEGMENT_COUNT, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, OggPageHeader.MAX_SEGMENT_COUNT, OggPageHeader.MAX_SEGMENT_COUNT)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(OggPageHeader.MAX_SEGMENT_COUNT, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(OggPageHeader.MAX_SEGMENT_COUNT, OggPageHeader.MAX_SEGMENT_COUNT, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(OggPageHeader.MAX_SEGMENT_COUNT, 0, OggPageHeader.MAX_SEGMENT_COUNT)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, OggPageHeader.MAX_SEGMENT_COUNT)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        IAuthTabCallback = Collections.unmodifiableMap(map2);
    }

    public static SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, List<ShapesKtExternalSyntheticLambda0> list) {
        String strAccess000 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000();
        if (strAccess000 == null) {
            return null;
        }
        Pattern pattern = onExtraCallbackWithResult;
        Matcher matcher = pattern.matcher(strAccess000);
        if (matcher.matches()) {
            return onNavigationEvent(null, matcher, textFieldDecoratorModifierNodeExternalSyntheticLambda20, list);
        }
        String strAccess0002 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000();
        if (strAccess0002 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strAccess0002);
        if (matcher2.matches()) {
            return onNavigationEvent(strAccess000.trim(), matcher2, textFieldDecoratorModifierNodeExternalSyntheticLambda20, list);
        }
        return null;
    }

    static ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult onNavigationEvent(String str) {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        onNavigationEvent(str, onwarmupcompleted);
        return onwarmupcompleted.onExtraCallback();
    }

    public static ImeEditCommand_androidKtExternalSyntheticLambda1 onExtraCallback(CharSequence charSequence) {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        onwarmupcompleted.asBinder = charSequence;
        return onwarmupcompleted.onExtraCallback().IAuthTabCallback();
    }

    static SpannedString onWarmupCompleted(@Nullable String str, String str2, List<ShapesKtExternalSyntheticLambda0> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str2.length()) {
            char cCharAt = str2.charAt(i2);
            if (cCharAt == '&') {
                i2++;
                int iIndexOf = str2.indexOf(59, i2);
                int iIndexOf2 = str2.indexOf(32, i2);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    IAuthTabCallback(str2.substring(i2, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i2 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt == '<') {
                int iOnWarmupCompleted = i2 + 1;
                if (iOnWarmupCompleted < str2.length()) {
                    boolean z = str2.charAt(iOnWarmupCompleted) == '/';
                    iOnWarmupCompleted = onWarmupCompleted(str2, iOnWarmupCompleted);
                    int i3 = iOnWarmupCompleted - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = z ? 2 : 1;
                    if (!z2) {
                        i3 = iOnWarmupCompleted - 1;
                    }
                    String strSubstring = str2.substring(i2 + i4, i3);
                    if (!strSubstring.trim().isEmpty()) {
                        String strOnWarmupCompleted = onWarmupCompleted(strSubstring);
                        if (IAuthTabCallback(strOnWarmupCompleted)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) arrayDeque.pop();
                                    onExtraCallback(str, iAuthTabCallback, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new onExtraCallback(iAuthTabCallback, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (iAuthTabCallback.onExtraCallbackWithResult.equals(strOnWarmupCompleted)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(IAuthTabCallback.IAuthTabCallback(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i2 = iOnWarmupCompleted;
            } else {
                spannableStringBuilder.append(cCharAt);
                i2++;
            }
        }
        while (!arrayDeque.isEmpty()) {
            onExtraCallback(str, (IAuthTabCallback) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        onExtraCallback(str, IAuthTabCallback.onExtraCallback(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0 onNavigationEvent(@Nullable String str, Matcher matcher, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, List<ShapesKtExternalSyntheticLambda0> list) {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        try {
            onwarmupcompleted.IAuthTabCallbackStub = SliderKtExternalSyntheticLambda12.onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1)));
            onwarmupcompleted.onWarmupCompleted = SliderKtExternalSyntheticLambda12.onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(2)));
            onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(3)), onwarmupcompleted);
            StringBuilder sb = new StringBuilder();
            String strAccess000 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000();
            while (!TextUtils.isEmpty(strAccess000)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strAccess000.trim());
                strAccess000 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000();
            }
            onwarmupcompleted.asBinder = onWarmupCompleted(str, sb.toString(), list);
            return onwarmupcompleted.onExtraCallbackWithResult();
        } catch (IllegalArgumentException unused) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    private static void onNavigationEvent(String str, onWarmupCompleted onwarmupcompleted) {
        Matcher matcher = onWarmupCompleted.matcher(str);
        while (matcher.find()) {
            String str2 = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1));
            String str3 = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    onExtraCallback(str3, onwarmupcompleted);
                } else if ("align".equals(str2)) {
                    onwarmupcompleted.asInterface = asInterface(str3);
                } else if ("position".equals(str2)) {
                    onExtraCallbackWithResult(str3, onwarmupcompleted);
                } else if ("size".equals(str2)) {
                    onwarmupcompleted.onTransact = SliderKtExternalSyntheticLambda12.IAuthTabCallback(str3);
                } else if ("vertical".equals(str2)) {
                    onwarmupcompleted.access100 = asBinder(str3);
                } else {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static void onExtraCallback(String str, onWarmupCompleted onwarmupcompleted) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            onwarmupcompleted.onExtraCallbackWithResult = onExtraCallbackWithResult(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            onwarmupcompleted.onNavigationEvent = SliderKtExternalSyntheticLambda12.IAuthTabCallback(str);
            onwarmupcompleted.IAuthTabCallback = 0;
        } else {
            onwarmupcompleted.onNavigationEvent = Integer.parseInt(str);
            onwarmupcompleted.IAuthTabCallback = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int onExtraCallbackWithResult(String str) {
        char c;
        switch (str.hashCode()) {
            case -1364013995:
                if (!str.equals(TtmlNode.CENTER)) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return 1;
        }
        if (c == 2) {
            return 2;
        }
        if (c == 3) {
            return 0;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WebvttCueParser", "Invalid anchor value: " + str);
        return Integer.MIN_VALUE;
    }

    private static void onExtraCallbackWithResult(String str, onWarmupCompleted onwarmupcompleted) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            onwarmupcompleted.IAuthTabCallbackDefault = onExtraCallback(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        onwarmupcompleted.onExtraCallback = SliderKtExternalSyntheticLambda12.IAuthTabCallback(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int onExtraCallback(String str) {
        char c;
        switch (str.hashCode()) {
            case -1842484672:
                if (!str.equals("line-left")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WebvttCueParser", "Invalid anchor value: " + str);
                                return Integer.MIN_VALUE;
                            }
                        }
                    }
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    private static int asBinder(String str) {
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int asInterface(String str) {
        char c;
        switch (str.hashCode()) {
            case -1364013995:
                if (!str.equals(TtmlNode.CENTER)) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    c = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 4;
        }
        if (c == 4) {
            return 5;
        }
        if (c == 5) {
            return 1;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WebvttCueParser", "Invalid alignment value: " + str);
        return 2;
    }

    private static int onWarmupCompleted(String str, int i2) {
        int iIndexOf = str.indexOf(62, i2);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void IAuthTabCallback(String str, SpannableStringBuilder spannableStringBuilder) {
        char c;
        int iHashCode = str.hashCode();
        if (iHashCode != 3309) {
            if (iHashCode != 3464) {
                if (iHashCode != 96708) {
                    c = (iHashCode == 3374865 && str.equals("nbsp")) ? (char) 3 : (char) 65535;
                } else if (str.equals("amp")) {
                    c = 2;
                }
            } else if (str.equals("lt")) {
                c = 1;
            }
        } else if (str.equals("gt")) {
            c = 0;
        }
        if (c == 0) {
            spannableStringBuilder.append('>');
            return;
        }
        if (c == 1) {
            spannableStringBuilder.append('<');
            return;
        }
        if (c == 2) {
            spannableStringBuilder.append('&');
            return;
        }
        if (c == 3) {
            spannableStringBuilder.append(' ');
            return;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean IAuthTabCallback(String str) {
        char c;
        int iHashCode = str.hashCode();
        if (iHashCode != 98) {
            if (iHashCode != 99) {
                if (iHashCode != 105) {
                    if (iHashCode != 3650) {
                        if (iHashCode != 3314158) {
                            if (iHashCode != 3511770) {
                                if (iHashCode != 117) {
                                    c = (iHashCode == 118 && str.equals("v")) ? (char) 4 : (char) 65535;
                                } else if (str.equals(RVParams.URL)) {
                                    c = 3;
                                }
                            } else if (str.equals(TtmlNode.ATTR_TTS_RUBY)) {
                                c = 7;
                            }
                        } else if (str.equals("lang")) {
                            c = 6;
                        }
                    } else if (str.equals(RVParams.READ_TITLE)) {
                        c = 5;
                    }
                } else if (str.equals("i")) {
                    c = 2;
                }
            } else if (str.equals("c")) {
                c = 1;
            }
        } else if (str.equals("b")) {
            c = 0;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onExtraCallback(@Nullable String str, IAuthTabCallback iAuthTabCallback, List<onExtraCallback> list, SpannableStringBuilder spannableStringBuilder, List<ShapesKtExternalSyntheticLambda0> list2) {
        char c;
        int i2 = iAuthTabCallback.onExtraCallback;
        int length = spannableStringBuilder.length();
        String str2 = iAuthTabCallback.onExtraCallbackWithResult;
        int iHashCode = str2.hashCode();
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    c = (iHashCode == 118 && str2.equals("v")) ? (char) 5 : (char) 65535;
                                } else if (str2.equals(RVParams.URL)) {
                                    c = 4;
                                }
                            } else if (str2.equals("c")) {
                                c = 2;
                            }
                        } else if (str2.equals("b")) {
                            c = 1;
                        }
                    } else if (str2.equals(TtmlNode.ATTR_TTS_RUBY)) {
                        c = 7;
                    }
                } else if (str2.equals("lang")) {
                    c = 6;
                }
            } else if (str2.equals("i")) {
                c = 3;
            }
        } else if (str2.equals("")) {
            c = 0;
        }
        switch (c) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 2:
                onWarmupCompleted(spannableStringBuilder, iAuthTabCallback.IAuthTabCallback, i2, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 5:
                onExtraCallbackWithResult(spannableStringBuilder, iAuthTabCallback.onWarmupCompleted, i2, length);
                break;
            case 7:
                onWarmupCompleted(spannableStringBuilder, str, iAuthTabCallback, list, list2);
                break;
            default:
                return;
        }
        List<onNavigationEvent> listOnNavigationEvent = onNavigationEvent(list2, str, iAuthTabCallback);
        for (int i3 = 0; i3 < listOnNavigationEvent.size(); i3++) {
            onWarmupCompleted(spannableStringBuilder, listOnNavigationEvent.get(i3).IAuthTabCallback, i2, length);
        }
    }

    private static void onWarmupCompleted(SpannableStringBuilder spannableStringBuilder, @Nullable String str, IAuthTabCallback iAuthTabCallback, List<onExtraCallback> list, List<ShapesKtExternalSyntheticLambda0> list2) {
        int iOnWarmupCompleted = onWarmupCompleted(list2, str, iAuthTabCallback);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, onExtraCallback.onExtraCallbackWithResult);
        int i2 = iAuthTabCallback.onExtraCallback;
        int length = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (RVParams.READ_TITLE.equals(((onExtraCallback) arrayList.get(i3)).onWarmupCompleted.onExtraCallbackWithResult)) {
                onExtraCallback onextracallback = (onExtraCallback) arrayList.get(i3);
                int iOnNavigationEvent = onNavigationEvent(onWarmupCompleted(list2, str, onextracallback.onWarmupCompleted), iOnWarmupCompleted, 1);
                int i4 = onextracallback.onWarmupCompleted.onExtraCallback - length;
                int i5 = onextracallback.onExtraCallback - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i4, i5);
                spannableStringBuilder.delete(i4, i5);
                spannableStringBuilder.setSpan(new RubySpan(charSequenceSubSequence.toString(), iOnNavigationEvent), i2, i4, 33);
                length += charSequenceSubSequence.length();
                i2 = i4;
            }
        }
    }

    private static int onWarmupCompleted(List<ShapesKtExternalSyntheticLambda0> list, @Nullable String str, IAuthTabCallback iAuthTabCallback) {
        List<onNavigationEvent> listOnNavigationEvent = onNavigationEvent(list, str, iAuthTabCallback);
        for (int i2 = 0; i2 < listOnNavigationEvent.size(); i2++) {
            ShapesKtExternalSyntheticLambda0 shapesKtExternalSyntheticLambda0 = listOnNavigationEvent.get(i2).IAuthTabCallback;
            if (shapesKtExternalSyntheticLambda0.onTransact() != -1) {
                return shapesKtExternalSyntheticLambda0.onTransact();
            }
        }
        return -1;
    }

    private static int onNavigationEvent(int i2, int i3, int i4) {
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        if (i4 != -1) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    private static void onWarmupCompleted(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i2, int i3) {
        for (String str : set) {
            Map<String, Integer> map = onNavigationEvent;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i2, i3, 33);
            } else {
                Map<String, Integer> map2 = IAuthTabCallback;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i2, i3, 33);
                }
            }
        }
    }

    private static void onExtraCallbackWithResult(SpannableStringBuilder spannableStringBuilder, String str, int i2, int i3) {
        spannableStringBuilder.setSpan(new ImeEditCommand_androidKtExternalSyntheticLambda6(str), i2, i3, 33);
    }

    private static void onWarmupCompleted(SpannableStringBuilder spannableStringBuilder, ShapesKtExternalSyntheticLambda0 shapesKtExternalSyntheticLambda0, int i2, int i3) {
        if (shapesKtExternalSyntheticLambda0 != null) {
            if (shapesKtExternalSyntheticLambda0.asInterface() != -1) {
                InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannableStringBuilder, new StyleSpan(shapesKtExternalSyntheticLambda0.asInterface()), i2, i3, 33);
            }
            if (shapesKtExternalSyntheticLambda0.IAuthTabCallbackStubProxy()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3, 33);
            }
            if (shapesKtExternalSyntheticLambda0.IAuthTabCallback_Parcel()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
            }
            if (shapesKtExternalSyntheticLambda0.IAuthTabCallbackStub()) {
                InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannableStringBuilder, new ForegroundColorSpan(shapesKtExternalSyntheticLambda0.onWarmupCompleted()), i2, i3, 33);
            }
            if (shapesKtExternalSyntheticLambda0.IAuthTabCallbackDefault()) {
                InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannableStringBuilder, new BackgroundColorSpan(shapesKtExternalSyntheticLambda0.onExtraCallback()), i2, i3, 33);
            }
            if (shapesKtExternalSyntheticLambda0.onExtraCallbackWithResult() != null) {
                InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannableStringBuilder, new TypefaceSpan(shapesKtExternalSyntheticLambda0.onExtraCallbackWithResult()), i2, i3, 33);
            }
            int iAsBinder = shapesKtExternalSyntheticLambda0.asBinder();
            if (iAsBinder == 1) {
                InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannableStringBuilder, new AbsoluteSizeSpan((int) shapesKtExternalSyntheticLambda0.onNavigationEvent(), true), i2, i3, 33);
            } else if (iAsBinder == 2) {
                InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannableStringBuilder, new RelativeSizeSpan(shapesKtExternalSyntheticLambda0.onNavigationEvent()), i2, i3, 33);
            } else if (iAsBinder == 3) {
                InputMethodManagerImplExternalSyntheticLambda0.IAuthTabCallback(spannableStringBuilder, new RelativeSizeSpan(shapesKtExternalSyntheticLambda0.onNavigationEvent() / 100.0f), i2, i3, 33);
            }
            if (shapesKtExternalSyntheticLambda0.IAuthTabCallback()) {
                spannableStringBuilder.setSpan(new LegacyTextInputMethodRequestExternalSyntheticLambda1(), i2, i3, 33);
            }
        }
    }

    private static String onWarmupCompleted(String str) {
        String strTrim = str.trim();
        RecordingInputConnection_androidKt.onNavigationEvent(!strTrim.isEmpty());
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(strTrim, "[ \\.]")[0];
    }

    private static List<onNavigationEvent> onNavigationEvent(List<ShapesKtExternalSyntheticLambda0> list, @Nullable String str, IAuthTabCallback iAuthTabCallback) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ShapesKtExternalSyntheticLambda0 shapesKtExternalSyntheticLambda0 = list.get(i2);
            int iOnExtraCallbackWithResult = shapesKtExternalSyntheticLambda0.onExtraCallbackWithResult(str, iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.onWarmupCompleted);
            if (iOnExtraCallbackWithResult > 0) {
                arrayList.add(new onNavigationEvent(iOnExtraCallbackWithResult, shapesKtExternalSyntheticLambda0));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    static final class onWarmupCompleted {
        public CharSequence asBinder;
        public long IAuthTabCallbackStub = 0;
        public long onWarmupCompleted = 0;
        public int asInterface = 2;
        public float onNavigationEvent = -3.4028235E38f;
        public int IAuthTabCallback = 1;
        public int onExtraCallbackWithResult = 0;
        public float onExtraCallback = -3.4028235E38f;
        public int IAuthTabCallbackDefault = Integer.MIN_VALUE;
        public float onTransact = 1.0f;
        public int access100 = Integer.MIN_VALUE;

        private static float onNavigationEvent(float f, int i2) {
            if (f == -3.4028235E38f || i2 != 0 || (f >= 0.0f && f <= 1.0f)) {
                return f != -3.4028235E38f ? f : i2 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static float onNavigationEvent(int i2) {
            if (i2 != 4) {
                return i2 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int onWarmupCompleted(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 3) {
                return 2;
            }
            if (i2 != 4) {
                return i2 != 5 ? 1 : 2;
            }
            return 0;
        }

        public SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0 onExtraCallbackWithResult() {
            return new SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0(onExtraCallback().IAuthTabCallback(), this.IAuthTabCallbackStub, this.onWarmupCompleted);
        }

        public ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult onExtraCallback() {
            float fOnNavigationEvent = this.onExtraCallback;
            if (fOnNavigationEvent == -3.4028235E38f) {
                fOnNavigationEvent = onNavigationEvent(this.asInterface);
            }
            int iOnWarmupCompleted = this.IAuthTabCallbackDefault;
            if (iOnWarmupCompleted == Integer.MIN_VALUE) {
                iOnWarmupCompleted = onWarmupCompleted(this.asInterface);
            }
            ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult().onExtraCallback(onExtraCallbackWithResult(this.asInterface)).onExtraCallback(onNavigationEvent(this.onNavigationEvent, this.IAuthTabCallback), this.IAuthTabCallback).onExtraCallbackWithResult(this.onExtraCallbackWithResult).onExtraCallbackWithResult(fOnNavigationEvent).onExtraCallback(iOnWarmupCompleted).IAuthTabCallback(Math.min(this.onTransact, onExtraCallback(iOnWarmupCompleted, fOnNavigationEvent))).onWarmupCompleted(this.access100);
            CharSequence charSequence = this.asBinder;
            if (charSequence != null) {
                onextracallbackwithresultOnWarmupCompleted.onNavigationEvent(charSequence);
            }
            return onextracallbackwithresultOnWarmupCompleted;
        }

        private static Layout.Alignment onExtraCallbackWithResult(int i2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WebvttCueParser", "Unknown textAlignment: " + i2);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float onExtraCallback(int i2, float f) {
            if (i2 == 0) {
                return 1.0f - f;
            }
            if (i2 == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i2 == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i2));
        }
    }

    static final class onNavigationEvent implements Comparable<onNavigationEvent> {
        public final ShapesKtExternalSyntheticLambda0 IAuthTabCallback;
        public final int onExtraCallback;

        public onNavigationEvent(int i2, ShapesKtExternalSyntheticLambda0 shapesKtExternalSyntheticLambda0) {
            this.onExtraCallback = i2;
            this.IAuthTabCallback = shapesKtExternalSyntheticLambda0;
        }

        @Override // java.lang.Comparable
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public int compareTo(onNavigationEvent onnavigationevent) {
            return Integer.compare(this.onExtraCallback, onnavigationevent.onExtraCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallback {
        public final Set<String> IAuthTabCallback;
        public final int onExtraCallback;
        public final String onExtraCallbackWithResult;
        public final String onWarmupCompleted;

        private IAuthTabCallback(String str, int i2, String str2, Set<String> set) {
            this.onExtraCallback = i2;
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = str2;
            this.IAuthTabCallback = set;
        }

        public static IAuthTabCallback IAuthTabCallback(String str, int i2) {
            String str2;
            String strTrim = str.trim();
            RecordingInputConnection_androidKt.onNavigationEvent(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(strTrim, "\\.");
            String str3 = strArrOnNavigationEvent[0];
            HashSet hashSet = new HashSet();
            for (int i3 = 1; i3 < strArrOnNavigationEvent.length; i3++) {
                hashSet.add(strArrOnNavigationEvent[i3]);
            }
            return new IAuthTabCallback(str3, i2, str2, hashSet);
        }

        public static IAuthTabCallback onExtraCallback() {
            return new IAuthTabCallback("", 0, "", Collections.EMPTY_SET);
        }
    }

    public static class onExtraCallback {
        private static final Comparator<onExtraCallback> onExtraCallbackWithResult = new Comparator() { // from class: androidx.media3.extractor.text.webvtt.WebvttCueParser$Element$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((SliderKtExternalSyntheticLambda15.onExtraCallback) obj).onWarmupCompleted.onExtraCallback, ((SliderKtExternalSyntheticLambda15.onExtraCallback) obj2).onWarmupCompleted.onExtraCallback);
            }
        };
        private final int onExtraCallback;
        private final IAuthTabCallback onWarmupCompleted;

        private onExtraCallback(IAuthTabCallback iAuthTabCallback, int i2) {
            this.onWarmupCompleted = iAuthTabCallback;
            this.onExtraCallback = i2;
        }
    }
}
