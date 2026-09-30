package o;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionManagerKtExternalSyntheticLambda3 implements TextFieldSelectionManager_androidKtExternalSyntheticLambda11 {
    private static final int[] IAuthTabCallback = {8, 13, 11, 2, 0, 1, 7};
    private final int IAuthTabCallbackDefault;
    private RippleKtExternalSyntheticLambda0.onExtraCallback asBinder;
    private int onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final boolean onWarmupCompleted;

    public TextFieldSelectionManagerKtExternalSyntheticLambda3() {
        this(0, true);
    }

    public TextFieldSelectionManagerKtExternalSyntheticLambda3(int i2, boolean z) {
        this.IAuthTabCallbackDefault = i2;
        this.onWarmupCompleted = z;
        this.asBinder = new ProgressIndicatorKtExternalSyntheticLambda7();
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda11
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public TextFieldSelectionManagerKtExternalSyntheticLambda0 createExtractor(Uri uri, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, Map<String, List<String>> map, DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) throws IOException {
        int iOnExtraCallbackWithResult = BasicTextContextMenuProviderKtExternalSyntheticLambda1.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable);
        int iOnNavigationEvent = BasicTextContextMenuProviderKtExternalSyntheticLambda1.onNavigationEvent(map);
        int iOnExtraCallback = BasicTextContextMenuProviderKtExternalSyntheticLambda1.onExtraCallback(uri);
        int[] iArr = IAuthTabCallback;
        ArrayList arrayList = new ArrayList(iArr.length);
        onNavigationEvent(iOnExtraCallbackWithResult, arrayList);
        onNavigationEvent(iOnNavigationEvent, arrayList);
        onNavigationEvent(iOnExtraCallback, arrayList);
        for (int i2 : iArr) {
            onNavigationEvent(i2, arrayList);
        }
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0 = null;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int iIntValue = ((Integer) arrayList.get(i3)).intValue();
            DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda02 = (DrawerStateExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onWarmupCompleted(iIntValue, basicTextContextMenuProviderKtExternalSyntheticLambda4, list, textFieldDecoratorModifierNodeExternalSyntheticLambda24));
            if (onWarmupCompleted(drawerStateExternalSyntheticLambda02, drawerKtExternalSyntheticLambda9)) {
                return new TextFieldSelectionManagerKtExternalSyntheticLambda0(drawerStateExternalSyntheticLambda02, basicTextContextMenuProviderKtExternalSyntheticLambda4, textFieldDecoratorModifierNodeExternalSyntheticLambda24, this.asBinder, this.onExtraCallbackWithResult);
            }
            if (drawerStateExternalSyntheticLambda0 == null && (iIntValue == iOnExtraCallbackWithResult || iIntValue == iOnNavigationEvent || iIntValue == iOnExtraCallback || iIntValue == 11)) {
                drawerStateExternalSyntheticLambda0 = drawerStateExternalSyntheticLambda02;
            }
        }
        return new TextFieldSelectionManagerKtExternalSyntheticLambda0((DrawerStateExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(drawerStateExternalSyntheticLambda0), basicTextContextMenuProviderKtExternalSyntheticLambda4, textFieldDecoratorModifierNodeExternalSyntheticLambda24, this.asBinder, this.onExtraCallbackWithResult);
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda11
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public TextFieldSelectionManagerKtExternalSyntheticLambda3 onExtraCallback(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this.asBinder = onextracallback;
        return this;
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda11
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public TextFieldSelectionManagerKtExternalSyntheticLambda3 onNavigationEvent(boolean z) {
        this.onExtraCallbackWithResult = z;
        return this;
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda11
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public TextFieldSelectionManagerKtExternalSyntheticLambda3 IAuthTabCallback(int i2) {
        this.onExtraCallback = i2;
        return this;
    }

    @Override // o.TextFieldSelectionManager_androidKtExternalSyntheticLambda11
    public BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        String str;
        if (!this.onExtraCallbackWithResult || !this.asBinder.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            return basicTextContextMenuProviderKtExternalSyntheticLambda4;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackStub = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().IAuthTabCallbackDefault("application/x-media3-cues").IAuthTabCallbackStub(this.asBinder.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4));
        StringBuilder sb = new StringBuilder();
        sb.append(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable);
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub != null) {
            str = " " + basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub;
        } else {
            str = "";
        }
        sb.append(str);
        return onextracallbackwithresultIAuthTabCallbackStub.onExtraCallback(sb.toString()).onExtraCallback(Long.MAX_VALUE).onNavigationEvent();
    }

    private static void onNavigationEvent(int i2, List<Integer> list) {
        if (Ints.indexOf(IAuthTabCallback, i2) == -1 || list.contains(Integer.valueOf(i2))) {
            return;
        }
        list.add(Integer.valueOf(i2));
    }

    private DrawerStateExternalSyntheticLambda0 onWarmupCompleted(int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24) {
        if (i2 == 0) {
            return new SliderKtExternalSyntheticLambda11();
        }
        if (i2 == 1) {
            return new SliderKtExternalSyntheticLambda18();
        }
        if (i2 == 2) {
            return new SliderKtExternalSyntheticLambda19();
        }
        if (i2 == 7) {
            return new OutlinedTextFieldKtExternalSyntheticLambda13(0, 0L);
        }
        if (i2 == 8) {
            return IAuthTabCallback(this.asBinder, this.onExtraCallbackWithResult, textFieldDecoratorModifierNodeExternalSyntheticLambda24, basicTextContextMenuProviderKtExternalSyntheticLambda4, list, this.onExtraCallback);
        }
        if (i2 == 11) {
            return IAuthTabCallback(this.IAuthTabCallbackDefault, this.onWarmupCompleted, basicTextContextMenuProviderKtExternalSyntheticLambda4, list, textFieldDecoratorModifierNodeExternalSyntheticLambda24, this.asBinder, this.onExtraCallbackWithResult);
        }
        if (i2 != 13) {
            return null;
        }
        return new AlertDialogKtExternalSyntheticLambda0(basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityLayout, textFieldDecoratorModifierNodeExternalSyntheticLambda24, this.asBinder, this.onExtraCallbackWithResult);
    }

    private static SnackbarHostKtExternalSyntheticLambda8 IAuthTabCallback(int i2, boolean z, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z2) {
        int i3;
        int i4 = i2 | 16;
        if (list != null) {
            i4 = i2 | 48;
        } else if (z) {
            list = Collections.singletonList(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("application/cea-608").onNavigationEvent());
        } else {
            list = Collections.EMPTY_LIST;
        }
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub;
        if (!TextUtils.isEmpty(str)) {
            if (!AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onWarmupCompleted(str, "audio/mp4a-latm")) {
                i4 |= 2;
            }
            if (!AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onWarmupCompleted(str, "video/avc")) {
                i4 |= 4;
            }
        }
        if (z2) {
            i3 = 0;
        } else {
            onextracallback = RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback;
            i3 = 1;
        }
        return new SnackbarHostKtExternalSyntheticLambda8(2, i3, onextracallback, textFieldDecoratorModifierNodeExternalSyntheticLambda24, new SliderKtExternalSyntheticLambda20(i4, list), 112800);
    }

    private static OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0 IAuthTabCallback(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, int i2) {
        int i3 = onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4) ? 4 : 0;
        if (!z) {
            onextracallback = RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback;
            i3 |= 32;
        }
        RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback2 = onextracallback;
        int iOnWarmupCompleted = OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0.onWarmupCompleted(i2);
        if (list == null) {
            list = ImmutableList.of();
        }
        return new OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0(onextracallback2, i3 | iOnWarmupCompleted, textFieldDecoratorModifierNodeExternalSyntheticLambda24, null, list, null);
    }

    private static boolean onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackDefault;
        if (handwritingHandlerNodeExternalSyntheticLambda0 == null) {
            return false;
        }
        for (int i2 = 0; i2 < handwritingHandlerNodeExternalSyntheticLambda0.onExtraCallback(); i2++) {
            if (handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i2) instanceof TextFieldSelectionManager_androidKtExternalSyntheticLambda7) {
                return !((TextFieldSelectionManager_androidKtExternalSyntheticLambda7) r2).IAuthTabCallback.isEmpty();
            }
        }
        return false;
    }

    private static boolean onWarmupCompleted(DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0, DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        try {
            boolean zOnExtraCallback = drawerStateExternalSyntheticLambda0.onExtraCallback(drawerKtExternalSyntheticLambda9);
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
            return zOnExtraCallback;
        } catch (EOFException unused) {
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
            return false;
        } catch (Throwable th) {
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
            throw th;
        }
    }
}
