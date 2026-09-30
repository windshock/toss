package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ScaffoldKtExternalSyntheticLambda8 {
    public final boolean IAuthTabCallback;
    private List<ScaffoldKtExternalSyntheticLambda8> IAuthTabCallbackDefault;
    public final String IAuthTabCallbackStub;
    private final HashMap<String, Integer> IAuthTabCallbackStubProxy;
    private final HashMap<String, Integer> IAuthTabCallback_Parcel;
    public final long asBinder;
    public final String asInterface;
    private final String[] getInterfaceDescriptor;
    public final String onExtraCallback;
    public final ScaffoldKtExternalSyntheticLambda8 onExtraCallbackWithResult;
    public final long onNavigationEvent;
    public final SecureTextFieldKtExternalSyntheticLambda1 onTransact;
    public final String onWarmupCompleted;

    public static ScaffoldKtExternalSyntheticLambda8 onExtraCallbackWithResult(String str) {
        return new ScaffoldKtExternalSyntheticLambda8(null, SecureTextFieldKtExternalSyntheticLambda2.onWarmupCompleted(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static ScaffoldKtExternalSyntheticLambda8 onWarmupCompleted(@Nullable String str, long j, long j2, @Nullable SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8) {
        return new ScaffoldKtExternalSyntheticLambda8(str, null, j, j2, secureTextFieldKtExternalSyntheticLambda1, strArr, str2, str3, scaffoldKtExternalSyntheticLambda8);
    }

    private ScaffoldKtExternalSyntheticLambda8(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8) {
        this.asInterface = str;
        this.IAuthTabCallbackStub = str2;
        this.onWarmupCompleted = str4;
        this.onTransact = secureTextFieldKtExternalSyntheticLambda1;
        this.getInterfaceDescriptor = strArr;
        this.IAuthTabCallback = str2 != null;
        this.asBinder = j;
        this.onNavigationEvent = j2;
        this.onExtraCallback = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(str3);
        this.onExtraCallbackWithResult = scaffoldKtExternalSyntheticLambda8;
        this.IAuthTabCallbackStubProxy = new HashMap<>();
        this.IAuthTabCallback_Parcel = new HashMap<>();
    }

    public boolean onNavigationEvent(long j) {
        long j2 = this.asBinder;
        if (j2 == -9223372036854775807L && this.onNavigationEvent == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.onNavigationEvent == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.onNavigationEvent) {
            return j2 <= j && j < this.onNavigationEvent;
        }
        return true;
    }

    public void onExtraCallbackWithResult(ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8) {
        if (this.IAuthTabCallbackDefault == null) {
            this.IAuthTabCallbackDefault = new ArrayList();
        }
        this.IAuthTabCallbackDefault.add(scaffoldKtExternalSyntheticLambda8);
    }

    public ScaffoldKtExternalSyntheticLambda8 onExtraCallbackWithResult(int i2) {
        List<ScaffoldKtExternalSyntheticLambda8> list = this.IAuthTabCallbackDefault;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(i2);
    }

    public int onExtraCallback() {
        List<ScaffoldKtExternalSyntheticLambda8> list = this.IAuthTabCallbackDefault;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long[] onExtraCallbackWithResult() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i2 = 0;
        onExtraCallback(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        return jArr;
    }

    private void onExtraCallback(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = TtmlNode.TAG_P.equals(this.asInterface);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(this.asInterface);
        if (z || zEquals || (zEquals2 && this.onWarmupCompleted != null)) {
            long j = this.asBinder;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.onNavigationEvent;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.IAuthTabCallbackDefault != null) {
            for (int i2 = 0; i2 < this.IAuthTabCallbackDefault.size(); i2++) {
                this.IAuthTabCallbackDefault.get(i2).onExtraCallback(treeSet, z || zEquals);
            }
        }
    }

    public String[] onNavigationEvent() {
        return this.getInterfaceDescriptor;
    }

    public List<ImeEditCommand_androidKtExternalSyntheticLambda1> onNavigationEvent(long j, Map<String, SecureTextFieldKtExternalSyntheticLambda1> map, Map<String, SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        onWarmupCompleted(j, this.onExtraCallback, arrayList);
        TreeMap treeMap = new TreeMap();
        onExtraCallbackWithResult(j, false, this.onExtraCallback, treeMap);
        onExtraCallback(j, map, map2, this.onExtraCallback, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1 secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1 = (SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(map2.get(pair.first));
                arrayList2.add(new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult().onNavigationEvent(bitmapDecodeByteArray).onExtraCallbackWithResult(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1.onTransact).onExtraCallback(0).onExtraCallback(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1.onNavigationEvent, 0).onExtraCallbackWithResult(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1.onWarmupCompleted).IAuthTabCallback(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1.asInterface).onNavigationEvent(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1.onExtraCallback).onWarmupCompleted(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1.IAuthTabCallbackStub).IAuthTabCallback());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1 secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda12 = (SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(map2.get(entry.getKey()));
            ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = (ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult) entry.getValue();
            IAuthTabCallback((SpannableStringBuilder) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback()));
            onextracallbackwithresult.onExtraCallback(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda12.onNavigationEvent, secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda12.onExtraCallbackWithResult);
            onextracallbackwithresult.onExtraCallbackWithResult(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda12.onWarmupCompleted);
            onextracallbackwithresult.onExtraCallbackWithResult(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda12.onTransact);
            onextracallbackwithresult.IAuthTabCallback(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda12.asInterface);
            onextracallbackwithresult.onNavigationEvent(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda12.asBinder, secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda12.IAuthTabCallbackDefault);
            onextracallbackwithresult.onWarmupCompleted(secureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda12.IAuthTabCallbackStub);
            arrayList2.add(onextracallbackwithresult.IAuthTabCallback());
        }
        return arrayList2;
    }

    private void onWarmupCompleted(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.onExtraCallback)) {
            str = this.onExtraCallback;
        }
        if (onNavigationEvent(j) && TtmlNode.TAG_DIV.equals(this.asInterface) && this.onWarmupCompleted != null) {
            list.add(new Pair<>(str, this.onWarmupCompleted));
            return;
        }
        for (int i2 = 0; i2 < onExtraCallback(); i2++) {
            onExtraCallbackWithResult(i2).onWarmupCompleted(j, str, list);
        }
    }

    private void onExtraCallbackWithResult(long j, boolean z, String str, Map<String, ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult> map) {
        this.IAuthTabCallbackStubProxy.clear();
        this.IAuthTabCallback_Parcel.clear();
        if (TtmlNode.TAG_METADATA.equals(this.asInterface)) {
            return;
        }
        if (!"".equals(this.onExtraCallback)) {
            str = this.onExtraCallback;
        }
        if (this.IAuthTabCallback && z) {
            onNavigationEvent(str, map).append((CharSequence) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub));
            return;
        }
        if (TtmlNode.TAG_BR.equals(this.asInterface) && z) {
            onNavigationEvent(str, map).append('\n');
            return;
        }
        if (onNavigationEvent(j)) {
            for (Map.Entry<String, ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult> entry : map.entrySet()) {
                this.IAuthTabCallbackStubProxy.put(entry.getKey(), Integer.valueOf(((CharSequence) RecordingInputConnection_androidKt.onExtraCallbackWithResult(entry.getValue().onExtraCallback())).length()));
            }
            boolean zEquals = TtmlNode.TAG_P.equals(this.asInterface);
            for (int i2 = 0; i2 < onExtraCallback(); i2++) {
                onExtraCallbackWithResult(i2).onExtraCallbackWithResult(j, z || zEquals, str, map);
            }
            if (zEquals) {
                SecureTextFieldKtExternalSyntheticLambda2.IAuthTabCallback(onNavigationEvent(str, map));
            }
            for (Map.Entry<String, ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult> entry2 : map.entrySet()) {
                this.IAuthTabCallback_Parcel.put(entry2.getKey(), Integer.valueOf(((CharSequence) RecordingInputConnection_androidKt.onExtraCallbackWithResult(entry2.getValue().onExtraCallback())).length()));
            }
        }
    }

    private static SpannableStringBuilder onNavigationEvent(String str, Map<String, ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult> map) {
        if (!map.containsKey(str)) {
            ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult();
            onextracallbackwithresult.onNavigationEvent(new SpannableStringBuilder());
            map.put(str, onextracallbackwithresult);
        }
        return (SpannableStringBuilder) RecordingInputConnection_androidKt.onExtraCallbackWithResult(map.get(str).onExtraCallback());
    }

    private void onExtraCallback(long j, Map<String, SecureTextFieldKtExternalSyntheticLambda1> map, Map<String, SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1> map2, String str, Map<String, ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult> map3) {
        int i2;
        if (onNavigationEvent(j)) {
            String str2 = !"".equals(this.onExtraCallback) ? this.onExtraCallback : str;
            Iterator<Map.Entry<String, Integer>> it = this.IAuthTabCallback_Parcel.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.IAuthTabCallbackStubProxy.containsKey(key) ? this.IAuthTabCallbackStubProxy.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    IAuthTabCallback(map, (ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(map3.get(key)), iIntValue, iIntValue2, ((SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(map2.get(str2))).IAuthTabCallbackStub);
                }
            }
            while (i2 < onExtraCallback()) {
                onExtraCallbackWithResult(i2).onExtraCallback(j, map, map2, str2, map3);
                i2++;
            }
        }
    }

    private void IAuthTabCallback(Map<String, SecureTextFieldKtExternalSyntheticLambda1> map, ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult, int i2, int i3, int i4) {
        SecureTextFieldKtExternalSyntheticLambda1 secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted = SecureTextFieldKtExternalSyntheticLambda2.onWarmupCompleted(this.onTransact, this.getInterfaceDescriptor, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) onextracallbackwithresult.onExtraCallback();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            onextracallbackwithresult.onNavigationEvent(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted != null) {
            SecureTextFieldKtExternalSyntheticLambda2.IAuthTabCallback(spannableStringBuilder2, i2, i3, secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted, this.onExtraCallbackWithResult, map, i4);
            if (TtmlNode.TAG_P.equals(this.asInterface)) {
                if (secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.getInterfaceDescriptor() != Float.MAX_VALUE) {
                    onextracallbackwithresult.onWarmupCompleted((secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.getInterfaceDescriptor() * (-90.0f)) / 100.0f);
                }
                if (secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.access000() != null) {
                    onextracallbackwithresult.onExtraCallback(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.access000());
                }
                if (secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallbackDefault() != null) {
                    onextracallbackwithresult.onWarmupCompleted(secureTextFieldKtExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallbackDefault());
                }
            }
        }
    }

    private static void IAuthTabCallback(SpannableStringBuilder spannableStringBuilder) {
        for (ScaffoldKtExternalSyntheticLambda6 scaffoldKtExternalSyntheticLambda6 : (ScaffoldKtExternalSyntheticLambda6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ScaffoldKtExternalSyntheticLambda6.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(scaffoldKtExternalSyntheticLambda6), spannableStringBuilder.getSpanEnd(scaffoldKtExternalSyntheticLambda6), "");
        }
        for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
            if (spannableStringBuilder.charAt(i2) == ' ') {
                int i3 = i2 + 1;
                int i4 = i3;
                while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                    i4++;
                }
                int i5 = i4 - i3;
                if (i5 > 0) {
                    spannableStringBuilder.delete(i2, i5 + i2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
            if (spannableStringBuilder.charAt(i6) == '\n') {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
            if (spannableStringBuilder.charAt(i8) == ' ') {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }
}
