package o;

import android.net.Uri;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o.DrawerKtExternalSyntheticLambda7;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda7 implements DrawerStateExternalSyntheticLambda2 {
    private static final int[] IAuthTabCallback = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult(new onExtraCallbackWithResult.onWarmupCompleted() { // from class: androidx.media3.extractor.DefaultExtractorsFactory$$ExternalSyntheticLambda0
        @Override // o.DrawerKtExternalSyntheticLambda7.onExtraCallbackWithResult.onWarmupCompleted
        public final Constructor getConstructor() {
            return DrawerKtExternalSyntheticLambda7.onNavigationEvent();
        }
    });
    private static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult(new onExtraCallbackWithResult.onWarmupCompleted() { // from class: androidx.media3.extractor.DefaultExtractorsFactory$$ExternalSyntheticLambda1
        @Override // o.DrawerKtExternalSyntheticLambda7.onExtraCallbackWithResult.onWarmupCompleted
        public final Constructor getConstructor() {
            return DrawerKtExternalSyntheticLambda7.onExtraCallback();
        }
    });
    private boolean IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private int access000;
    private int access100;
    private boolean asBinder;
    private int asInterface;
    private int getInterfaceDescriptor;
    private int onTransact;
    private int onWarmupCompleted;
    private int readTypedObject;
    private ImmutableList<BasicTextContextMenuProviderKtExternalSyntheticLambda4> writeTypedObject;
    private int extraCallbackWithResult = 1;
    private int onPostMessage = 112800;
    private RippleKtExternalSyntheticLambda0.onExtraCallback ICustomTabsCallback = new ProgressIndicatorKtExternalSyntheticLambda7();
    private boolean extraCallback = true;

    @Override // o.DrawerStateExternalSyntheticLambda2
    @Deprecated
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public DrawerKtExternalSyntheticLambda7 onExtraCallback(boolean z) {
        synchronized (this) {
            this.extraCallback = z;
        }
        return this;
    }

    @Override // o.DrawerStateExternalSyntheticLambda2
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public DrawerKtExternalSyntheticLambda7 onExtraCallbackWithResult(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        synchronized (this) {
            this.ICustomTabsCallback = onextracallback;
        }
        return this;
    }

    @Override // o.DrawerStateExternalSyntheticLambda2
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public DrawerKtExternalSyntheticLambda7 onExtraCallback(int i2) {
        synchronized (this) {
            this.IAuthTabCallbackStub = i2;
        }
        return this;
    }

    public DrawerKtExternalSyntheticLambda7 onExtraCallbackWithResult(int i2) {
        synchronized (this) {
            this.IAuthTabCallbackStubProxy = i2;
        }
        return this;
    }

    @Override // o.DrawerStateExternalSyntheticLambda2
    public DrawerStateExternalSyntheticLambda0[] createExtractors() {
        DrawerStateExternalSyntheticLambda0[] drawerStateExternalSyntheticLambda0ArrIAuthTabCallback;
        synchronized (this) {
            drawerStateExternalSyntheticLambda0ArrIAuthTabCallback = IAuthTabCallback(Uri.EMPTY, new HashMap());
        }
        return drawerStateExternalSyntheticLambda0ArrIAuthTabCallback;
    }

    @Override // o.DrawerStateExternalSyntheticLambda2
    public DrawerStateExternalSyntheticLambda0[] IAuthTabCallback(Uri uri, Map<String, List<String>> map) {
        DrawerStateExternalSyntheticLambda0[] drawerStateExternalSyntheticLambda0Arr;
        synchronized (this) {
            int[] iArr = IAuthTabCallback;
            ArrayList arrayList = new ArrayList(iArr.length);
            int iOnNavigationEvent = BasicTextContextMenuProviderKtExternalSyntheticLambda1.onNavigationEvent(map);
            if (iOnNavigationEvent != -1) {
                onNavigationEvent(iOnNavigationEvent, arrayList);
            }
            int iOnExtraCallback = BasicTextContextMenuProviderKtExternalSyntheticLambda1.onExtraCallback(uri);
            if (iOnExtraCallback != -1 && iOnExtraCallback != iOnNavigationEvent) {
                onNavigationEvent(iOnExtraCallback, arrayList);
            }
            for (int i2 : iArr) {
                if (i2 != iOnNavigationEvent && i2 != iOnExtraCallback) {
                    onNavigationEvent(i2, arrayList);
                }
            }
            drawerStateExternalSyntheticLambda0Arr = (DrawerStateExternalSyntheticLambda0[]) arrayList.toArray(new DrawerStateExternalSyntheticLambda0[0]);
        }
        return drawerStateExternalSyntheticLambda0Arr;
    }

    private void onNavigationEvent(int i2, List<DrawerStateExternalSyntheticLambda0> list) {
        switch (i2) {
            case 0:
                list.add(new SliderKtExternalSyntheticLambda11());
                break;
            case 1:
                list.add(new SliderKtExternalSyntheticLambda18());
                break;
            case 2:
                list.add(new SliderKtExternalSyntheticLambda19(this.onWarmupCompleted | (this.asBinder ? 1 : 0) | (this.IAuthTabCallbackDefault ? 2 : 0)));
                break;
            case 3:
                list.add(new FloatingActionButtonKtExternalSyntheticLambda2(this.onTransact | (this.asBinder ? 1 : 0) | (this.IAuthTabCallbackDefault ? 2 : 0)));
                break;
            case 4:
                DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0OnWarmupCompleted = onExtraCallback.onWarmupCompleted(Integer.valueOf(this.asInterface));
                if (drawerStateExternalSyntheticLambda0OnWarmupCompleted != null) {
                    list.add(drawerStateExternalSyntheticLambda0OnWarmupCompleted);
                    break;
                } else {
                    list.add(new ListItemKtExternalSyntheticLambda1(this.asInterface));
                    break;
                }
            case 5:
                list.add(new ListItemKtExternalSyntheticLambda0());
                break;
            case 6:
                list.add(new OneLineExternalSyntheticLambda0(this.ICustomTabsCallback, (this.extraCallback ? 0 : 2) | this.getInterfaceDescriptor));
                break;
            case 7:
                list.add(new OutlinedTextFieldKtExternalSyntheticLambda13(this.IAuthTabCallback_Parcel | (this.asBinder ? 1 : 0) | (this.IAuthTabCallbackDefault ? 2 : 0)));
                break;
            case 8:
                list.add(new OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0(this.ICustomTabsCallback, this.access000 | OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0.onWarmupCompleted(this.IAuthTabCallbackStub) | (this.extraCallback ? 0 : 32)));
                list.add(new OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0(this.ICustomTabsCallback, (this.extraCallback ? 0 : 16) | this.access100 | OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0.onExtraCallback(this.IAuthTabCallbackStub)));
                break;
            case 9:
                list.add(new ProgressIndicatorKtExternalSyntheticLambda16());
                break;
            case 10:
                list.add(new SnackbarHostKtExternalSyntheticLambda2());
                break;
            case 11:
                if (this.writeTypedObject == null) {
                    this.writeTypedObject = ImmutableList.of();
                }
                list.add(new SnackbarHostKtExternalSyntheticLambda8(this.extraCallbackWithResult, !this.extraCallback ? 1 : 0, this.ICustomTabsCallback, new TextFieldDecoratorModifierNodeExternalSyntheticLambda24(0L), new SliderKtExternalSyntheticLambda20(this.readTypedObject, this.writeTypedObject), this.onPostMessage));
                break;
            case 12:
                list.add(new SnackbarKtExternalSyntheticLambda11());
                break;
            case 14:
                list.add(new ListItemKtOffsetToBaselineOrCenter11ExternalSyntheticLambda0(this.IAuthTabCallbackStubProxy));
                break;
            case 15:
                DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0OnWarmupCompleted2 = onExtraCallbackWithResult.onWarmupCompleted(new Object[0]);
                if (drawerStateExternalSyntheticLambda0OnWarmupCompleted2 != null) {
                    list.add(drawerStateExternalSyntheticLambda0OnWarmupCompleted2);
                    break;
                }
                break;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                list.add(new FloatingActionButtonKtExternalSyntheticLambda3(!this.extraCallback ? 1 : 0, this.ICustomTabsCallback));
                break;
            case 17:
                list.add(new ProgressIndicatorKtExternalSyntheticLambda5());
                break;
            case 18:
                list.add(new SnackbarKtExternalSyntheticLambda9());
                break;
            case 19:
                list.add(new InteractiveComponentSizeKtExternalSyntheticLambda0());
                break;
            case 20:
                int i3 = this.access100;
                if ((i3 & 2) == 0 && (i3 & 4) == 0) {
                    list.add(new ListItemKtExternalSyntheticLambda4());
                    break;
                }
                break;
            case 21:
                list.add(new IconKtExternalSyntheticLambda0());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends DrawerStateExternalSyntheticLambda0> onExtraCallback() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(DrawerStateExternalSyntheticLambda0.class).getConstructor(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends DrawerStateExternalSyntheticLambda0> onNavigationEvent() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(DrawerStateExternalSyntheticLambda0.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onExtraCallbackWithResult {
        private final AtomicBoolean onExtraCallback = new AtomicBoolean(false);
        private Constructor<? extends DrawerStateExternalSyntheticLambda0> onNavigationEvent;
        private final onWarmupCompleted onWarmupCompleted;

        public interface onWarmupCompleted {
            Constructor<? extends DrawerStateExternalSyntheticLambda0> getConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
            this.onWarmupCompleted = onwarmupcompleted;
        }

        public DrawerStateExternalSyntheticLambda0 onWarmupCompleted(Object... objArr) {
            Constructor<? extends DrawerStateExternalSyntheticLambda0> constructorOnNavigationEvent = onNavigationEvent();
            if (constructorOnNavigationEvent == null) {
                return null;
            }
            try {
                return constructorOnNavigationEvent.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        private Constructor<? extends DrawerStateExternalSyntheticLambda0> onNavigationEvent() {
            synchronized (this.onExtraCallback) {
                if (this.onExtraCallback.get()) {
                    return this.onNavigationEvent;
                }
                try {
                    return this.onWarmupCompleted.getConstructor();
                } catch (ClassNotFoundException unused) {
                    this.onExtraCallback.set(true);
                    return this.onNavigationEvent;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }
}
