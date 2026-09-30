package o;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;
import o.RippleKtExternalSyntheticLambda0;
import o.ScaffoldKtExternalSyntheticLambda2;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ScaffoldKtExternalSyntheticLambda12 implements RippleKtExternalSyntheticLambda0 {
    private static final Pattern onWarmupCompleted = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final ScaffoldKtExternalSyntheticLambda4 IAuthTabCallback;
    private float asBinder;
    private Map<String, ScaffoldKtExternalSyntheticLambda2> asInterface;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallback;
    private float onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    private static float onExtraCallback(int i2) {
        if (i2 == 0) {
            return 0.05f;
        }
        if (i2 != 1) {
            return i2 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public int onExtraCallback() {
        return 1;
    }

    public ScaffoldKtExternalSyntheticLambda12() {
        this(null);
    }

    public ScaffoldKtExternalSyntheticLambda12(@Nullable List<byte[]> list) {
        this.asBinder = -3.4028235E38f;
        this.onExtraCallbackWithResult = -3.4028235E38f;
        this.onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        if (list != null && !list.isEmpty()) {
            this.onNavigationEvent = true;
            String strOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(list.get(0));
            RecordingInputConnection_androidKt.onNavigationEvent(strOnWarmupCompleted.startsWith("Format:"));
            this.IAuthTabCallback = (ScaffoldKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(ScaffoldKtExternalSyntheticLambda4.onNavigationEvent(strOnWarmupCompleted));
            onNavigationEvent(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(list.get(1)), StandardCharsets.UTF_8);
            return;
        }
        this.onNavigationEvent = false;
        this.IAuthTabCallback = null;
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, int i2, int i3, RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.onExtraCallback.onExtraCallback(bArr, i2 + i3);
        this.onExtraCallback.asBinder(i2);
        Charset charsetIAuthTabCallback = IAuthTabCallback(this.onExtraCallback);
        if (!this.onNavigationEvent) {
            onNavigationEvent(this.onExtraCallback, charsetIAuthTabCallback);
        }
        IAuthTabCallback(this.onExtraCallback, arrayList, arrayList2, charsetIAuthTabCallback);
        ArrayList arrayList3 = (onnavigationevent.IAuthTabCallback == -9223372036854775807L || !onnavigationevent.onNavigationEvent) ? null : new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            List<ImeEditCommand_androidKtExternalSyntheticLambda1> list = arrayList.get(i4);
            if (!list.isEmpty() || i4 == 0) {
                if (i4 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = arrayList2.get(i4).longValue();
                long jLongValue2 = arrayList2.get(i4 + 1).longValue();
                RadioButtonDefaults radioButtonDefaults = new RadioButtonDefaults(list, jLongValue, jLongValue2 - jLongValue);
                long j = onnavigationevent.IAuthTabCallback;
                if (j == -9223372036854775807L || jLongValue2 >= j) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(radioButtonDefaults);
                } else if (arrayList3 != null) {
                    arrayList3.add(radioButtonDefaults);
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept((RadioButtonDefaults) it.next());
            }
        }
    }

    private Charset IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        Charset charsetExtraCommand = textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCommand();
        return charsetExtraCommand != null ? charsetExtraCommand : StandardCharsets.UTF_8;
    }

    private void onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, Charset charset) {
        while (true) {
            String strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(charset);
            if (strOnWarmupCompleted == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strOnWarmupCompleted)) {
                IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strOnWarmupCompleted)) {
                this.asInterface = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strOnWarmupCompleted)) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strOnWarmupCompleted)) {
                return;
            }
        }
    }

    private void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, Charset charset) {
        while (true) {
            String strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(charset);
            if (strOnWarmupCompleted == null) {
                return;
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() != 0 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(charset) == 91) {
                return;
            }
            String[] strArrSplit = strOnWarmupCompleted.split(":");
            if (strArrSplit.length == 2) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[0].trim());
                if (lowerCase.equals("playresx")) {
                    this.asBinder = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.onExtraCallbackWithResult = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, ScaffoldKtExternalSyntheticLambda2> onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, Charset charset) throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ScaffoldKtExternalSyntheticLambda2.IAuthTabCallback IAuthTabCallback = null;
        while (true) {
            String strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(charset);
            if (strOnWarmupCompleted == null || (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() != 0 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(charset) == 91)) {
                break;
            }
            if (strOnWarmupCompleted.startsWith("Format:")) {
                IAuthTabCallback = ScaffoldKtExternalSyntheticLambda2.IAuthTabCallback.IAuthTabCallback(strOnWarmupCompleted);
            } else if (strOnWarmupCompleted.startsWith("Style:")) {
                if (IAuthTabCallback == null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strOnWarmupCompleted);
                } else {
                    ScaffoldKtExternalSyntheticLambda2 scaffoldKtExternalSyntheticLambda2OnNavigationEvent = ScaffoldKtExternalSyntheticLambda2.onNavigationEvent(strOnWarmupCompleted, IAuthTabCallback);
                    if (scaffoldKtExternalSyntheticLambda2OnNavigationEvent != null) {
                        linkedHashMap.put(scaffoldKtExternalSyntheticLambda2OnNavigationEvent.asBinder, scaffoldKtExternalSyntheticLambda2OnNavigationEvent);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, List<List<ImeEditCommand_androidKtExternalSyntheticLambda1>> list, List<Long> list2, Charset charset) throws Throwable {
        ScaffoldKtExternalSyntheticLambda4 scaffoldKtExternalSyntheticLambda4OnNavigationEvent = this.onNavigationEvent ? this.IAuthTabCallback : null;
        while (true) {
            String strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(charset);
            if (strOnWarmupCompleted == null) {
                return;
            }
            if (strOnWarmupCompleted.startsWith("Format:")) {
                scaffoldKtExternalSyntheticLambda4OnNavigationEvent = ScaffoldKtExternalSyntheticLambda4.onNavigationEvent(strOnWarmupCompleted);
            } else if (strOnWarmupCompleted.startsWith("Dialogue:")) {
                if (scaffoldKtExternalSyntheticLambda4OnNavigationEvent == null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaParser", "Skipping dialogue line before complete format: " + strOnWarmupCompleted);
                } else {
                    onNavigationEvent(strOnWarmupCompleted, scaffoldKtExternalSyntheticLambda4OnNavigationEvent, list, list2);
                }
            }
        }
    }

    private void onNavigationEvent(String str, ScaffoldKtExternalSyntheticLambda4 scaffoldKtExternalSyntheticLambda4, List<List<ImeEditCommand_androidKtExternalSyntheticLambda1>> list, List<Long> list2) throws NumberFormatException {
        int i2;
        int i3;
        RecordingInputConnection_androidKt.onNavigationEvent(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", scaffoldKtExternalSyntheticLambda4.onExtraCallbackWithResult);
        if (strArrSplit.length != scaffoldKtExternalSyntheticLambda4.onExtraCallbackWithResult) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        int i4 = scaffoldKtExternalSyntheticLambda4.onExtraCallback;
        if (i4 != -1) {
            try {
                i2 = Integer.parseInt(strArrSplit[i4].trim());
            } catch (RuntimeException unused) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaParser", "Fail to parse layer: " + strArrSplit[scaffoldKtExternalSyntheticLambda4.onExtraCallback]);
            }
        } else {
            i2 = 0;
        }
        int i5 = i2;
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult(strArrSplit[scaffoldKtExternalSyntheticLambda4.onWarmupCompleted]);
        if (jOnExtraCallbackWithResult == -9223372036854775807L) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jOnExtraCallbackWithResult2 = onExtraCallbackWithResult(strArrSplit[scaffoldKtExternalSyntheticLambda4.onNavigationEvent]);
        if (jOnExtraCallbackWithResult2 == -9223372036854775807L || jOnExtraCallbackWithResult2 <= jOnExtraCallbackWithResult) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, ScaffoldKtExternalSyntheticLambda2> map = this.asInterface;
        ScaffoldKtExternalSyntheticLambda2 scaffoldKtExternalSyntheticLambda2 = (map == null || (i3 = scaffoldKtExternalSyntheticLambda4.IAuthTabCallback) == -1) ? null : map.get(strArrSplit[i3].trim());
        String str2 = strArrSplit[scaffoldKtExternalSyntheticLambda4.asBinder];
        ImeEditCommand_androidKtExternalSyntheticLambda1 imeEditCommand_androidKtExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted(ScaffoldKtExternalSyntheticLambda2.onExtraCallback.onWarmupCompleted(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), i5, scaffoldKtExternalSyntheticLambda2, ScaffoldKtExternalSyntheticLambda2.onExtraCallback.IAuthTabCallback(str2), this.asBinder, this.onExtraCallbackWithResult);
        int iOnNavigationEvent = onNavigationEvent(jOnExtraCallbackWithResult2, list2, list);
        for (int iOnNavigationEvent2 = onNavigationEvent(jOnExtraCallbackWithResult, list2, list); iOnNavigationEvent2 < iOnNavigationEvent; iOnNavigationEvent2++) {
            list.get(iOnNavigationEvent2).add(imeEditCommand_androidKtExternalSyntheticLambda1OnWarmupCompleted);
        }
    }

    private static long onExtraCallbackWithResult(String str) throws NumberFormatException {
        Matcher matcher = onWarmupCompleted.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        Object[] objArr = {matcher.group(1)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        long j = Long.parseLong((String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742));
        Object[] objArr2 = {matcher.group(2)};
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        long j2 = Long.parseLong((String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, objArr2, -1084655742));
        Object[] objArr3 = {matcher.group(3)};
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        long j3 = (j * 3600000000L) + (j2 * 60000000) + (Long.parseLong((String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent3, objArr3, -1084655742)) * 1000000);
        Object[] objArr4 = {matcher.group(4)};
        int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return j3 + (Long.parseLong((String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent4, objArr4, -1084655742)) * 10000);
    }

    private static ImeEditCommand_androidKtExternalSyntheticLambda1 onWarmupCompleted(String str, int i2, @Nullable ScaffoldKtExternalSyntheticLambda2 scaffoldKtExternalSyntheticLambda2, ScaffoldKtExternalSyntheticLambda2.onExtraCallback onextracallback, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult().onNavigationEvent(spannableString).onNavigationEvent(i2);
        if (scaffoldKtExternalSyntheticLambda2 != null) {
            if (scaffoldKtExternalSyntheticLambda2.asInterface != null) {
                spannableString.setSpan(new ForegroundColorSpan(scaffoldKtExternalSyntheticLambda2.asInterface.intValue()), 0, spannableString.length(), 33);
            }
            if (scaffoldKtExternalSyntheticLambda2.onWarmupCompleted == 3 && scaffoldKtExternalSyntheticLambda2.IAuthTabCallbackStub != null) {
                spannableString.setSpan(new BackgroundColorSpan(scaffoldKtExternalSyntheticLambda2.IAuthTabCallbackStub.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = scaffoldKtExternalSyntheticLambda2.onNavigationEvent;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                onextracallbackwithresultOnNavigationEvent.onNavigationEvent(f3 / f2, 1);
            }
            boolean z = scaffoldKtExternalSyntheticLambda2.IAuthTabCallback;
            if (z && scaffoldKtExternalSyntheticLambda2.onExtraCallback) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (scaffoldKtExternalSyntheticLambda2.onExtraCallback) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (scaffoldKtExternalSyntheticLambda2.onTransact) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (scaffoldKtExternalSyntheticLambda2.IAuthTabCallbackDefault) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i3 = onextracallback.onNavigationEvent;
        if (i3 == -1) {
            i3 = scaffoldKtExternalSyntheticLambda2 != null ? scaffoldKtExternalSyntheticLambda2.onExtraCallbackWithResult : -1;
        }
        onextracallbackwithresultOnNavigationEvent.onExtraCallback(onExtraCallbackWithResult(i3)).onExtraCallback(IAuthTabCallback(i3)).onExtraCallbackWithResult(onNavigationEvent(i3));
        PointF pointF = onextracallback.onExtraCallbackWithResult;
        if (pointF != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(pointF.x / f);
            onextracallbackwithresultOnNavigationEvent.onExtraCallback(onextracallback.onExtraCallbackWithResult.y / f2, 0);
        } else {
            onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(onExtraCallback(onextracallbackwithresultOnNavigationEvent.onWarmupCompleted()));
            onextracallbackwithresultOnNavigationEvent.onExtraCallback(onExtraCallback(onextracallbackwithresultOnNavigationEvent.onNavigationEvent()), 0);
        }
        return onextracallbackwithresultOnNavigationEvent.IAuthTabCallback();
    }

    private static Layout.Alignment onExtraCallbackWithResult(int i2) {
        switch (i2) {
            case -1:
                return null;
            case 0:
            default:
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaParser", "Unknown alignment: " + i2);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static int onNavigationEvent(int i2) {
        switch (i2) {
            case -1:
                break;
            case 0:
            default:
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaParser", "Unknown alignment: " + i2);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int IAuthTabCallback(int i2) {
        switch (i2) {
            case -1:
                break;
            case 0:
            default:
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SsaParser", "Unknown alignment: " + i2);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int onNavigationEvent(long j, List<Long> list, List<List<ImeEditCommand_androidKtExternalSyntheticLambda1>> list2) {
        int i2;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i2 = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i2 = size + 1;
                break;
            }
            size--;
        }
        list.add(i2, Long.valueOf(j));
        list2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList(list2.get(i2 - 1)));
        return i2;
    }
}
