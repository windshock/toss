package o;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextInclusionStrategyCompanionExternalSyntheticLambda2 implements isSegmentInside {
    private static final Bitmap.Config[] IAuthTabCallback;
    private static final Bitmap.Config[] onExtraCallback;
    private static final Bitmap.Config[] onExtraCallbackWithResult;
    private static final Bitmap.Config[] onNavigationEvent;
    private static final Bitmap.Config[] onWarmupCompleted;
    private final IAuthTabCallback asInterface = new IAuthTabCallback();
    private final Savers_androidKtExternalSyntheticLambda9<onExtraCallbackWithResult, Bitmap> IAuthTabCallbackStub = new Savers_androidKtExternalSyntheticLambda9<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> asBinder = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = StabilizationMode.onNavigationEvent();
        }
        onNavigationEvent = configArr;
        IAuthTabCallback = configArr;
        onExtraCallback = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        onExtraCallbackWithResult = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        onWarmupCompleted = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    @Override // o.isSegmentInside
    public void onExtraCallbackWithResult(Bitmap bitmap) {
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = this.asInterface.onExtraCallback(applyConstraintsFromLayoutParams.onWarmupCompleted(bitmap), bitmap.getConfig());
        this.IAuthTabCallbackStub.IAuthTabCallback(onextracallbackwithresultOnExtraCallback, bitmap);
        NavigableMap<Integer, Integer> navigableMapOnExtraCallback = onExtraCallback(bitmap.getConfig());
        Integer num = navigableMapOnExtraCallback.get(Integer.valueOf(onextracallbackwithresultOnExtraCallback.onNavigationEvent));
        navigableMapOnExtraCallback.put(Integer.valueOf(onextracallbackwithresultOnExtraCallback.onNavigationEvent), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // o.isSegmentInside
    public Bitmap onWarmupCompleted(int i2, int i3, Bitmap.Config config) {
        onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = IAuthTabCallback(applyConstraintsFromLayoutParams.onNavigationEvent(i2, i3, config), config);
        Bitmap bitmapOnWarmupCompleted = this.IAuthTabCallbackStub.onWarmupCompleted(onextracallbackwithresultIAuthTabCallback);
        if (bitmapOnWarmupCompleted != null) {
            onExtraCallback(Integer.valueOf(onextracallbackwithresultIAuthTabCallback.onNavigationEvent), bitmapOnWarmupCompleted);
            bitmapOnWarmupCompleted.reconfigure(i2, i3, config);
        }
        return bitmapOnWarmupCompleted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private onExtraCallbackWithResult IAuthTabCallback(int i2, Bitmap.Config config) {
        onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = this.asInterface.onExtraCallback(i2, config);
        Bitmap.Config[] configArrIAuthTabCallback = IAuthTabCallback(config);
        int length = configArrIAuthTabCallback.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArrIAuthTabCallback[i3];
            Integer numCeilingKey = onExtraCallback(config2).ceilingKey(Integer.valueOf(i2));
            if (numCeilingKey == null || numCeilingKey.intValue() > (i2 << 3)) {
                i3++;
            } else if (numCeilingKey.intValue() != i2 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.asInterface.IAuthTabCallback(onextracallbackwithresultOnExtraCallback);
                return this.asInterface.onExtraCallback(numCeilingKey.intValue(), config2);
            }
        }
    }

    @Override // o.isSegmentInside
    public Bitmap IAuthTabCallback() {
        Bitmap bitmapOnNavigationEvent = this.IAuthTabCallbackStub.onNavigationEvent();
        if (bitmapOnNavigationEvent != null) {
            onExtraCallback(Integer.valueOf(applyConstraintsFromLayoutParams.onWarmupCompleted(bitmapOnNavigationEvent)), bitmapOnNavigationEvent);
        }
        return bitmapOnNavigationEvent;
    }

    private void onExtraCallback(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapOnExtraCallback = onExtraCallback(bitmap.getConfig());
        Integer num2 = navigableMapOnExtraCallback.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + onNavigationEvent(bitmap) + ", this: " + this);
        }
        if (num2.intValue() == 1) {
            navigableMapOnExtraCallback.remove(num);
        } else {
            navigableMapOnExtraCallback.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> onExtraCallback(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.asBinder.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.asBinder.put(config, treeMap);
        return treeMap;
    }

    @Override // o.isSegmentInside
    public String onNavigationEvent(Bitmap bitmap) {
        return onNavigationEvent(applyConstraintsFromLayoutParams.onWarmupCompleted(bitmap), bitmap.getConfig());
    }

    @Override // o.isSegmentInside
    public String onNavigationEvent(int i2, int i3, Bitmap.Config config) {
        return onNavigationEvent(applyConstraintsFromLayoutParams.onNavigationEvent(i2, i3, config), config);
    }

    @Override // o.isSegmentInside
    public int IAuthTabCallback(Bitmap bitmap) {
        return applyConstraintsFromLayoutParams.onWarmupCompleted(bitmap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.IAuthTabCallbackStub);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.asBinder.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.asBinder.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    static class IAuthTabCallback extends Savers_androidKtExternalSyntheticLambda4<onExtraCallbackWithResult> {
        IAuthTabCallback() {
        }

        public onExtraCallbackWithResult onExtraCallback(int i2, Bitmap.Config config) {
            onExtraCallbackWithResult onExtraCallbackWithResult = onExtraCallbackWithResult();
            onExtraCallbackWithResult.IAuthTabCallback(i2, config);
            return onExtraCallbackWithResult;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.Savers_androidKtExternalSyntheticLambda4
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public onExtraCallbackWithResult onExtraCallback() {
            return new onExtraCallbackWithResult(this);
        }
    }

    static final class onExtraCallbackWithResult implements TextInclusionStrategyCompanionExternalSyntheticLambda1 {
        private Bitmap.Config IAuthTabCallback;
        private final IAuthTabCallback onExtraCallback;
        int onNavigationEvent;

        public onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) {
            this.onExtraCallback = iAuthTabCallback;
        }

        public void IAuthTabCallback(int i2, Bitmap.Config config) {
            this.onNavigationEvent = i2;
            this.IAuthTabCallback = config;
        }

        @Override // o.TextInclusionStrategyCompanionExternalSyntheticLambda1
        public void onExtraCallback() {
            this.onExtraCallback.IAuthTabCallback(this);
        }

        public String toString() {
            return TextInclusionStrategyCompanionExternalSyntheticLambda2.onNavigationEvent(this.onNavigationEvent, this.IAuthTabCallback);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return this.onNavigationEvent == onextracallbackwithresult.onNavigationEvent && applyConstraintsFromLayoutParams.onExtraCallback(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback);
        }

        public int hashCode() {
            int i2 = this.onNavigationEvent;
            Bitmap.Config config = this.IAuthTabCallback;
            return (i2 * 31) + (config != null ? config.hashCode() : 0);
        }
    }

    static String onNavigationEvent(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    private static Bitmap.Config[] IAuthTabCallback(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && StabilizationMode.onNavigationEvent().equals(config)) {
            return IAuthTabCallback;
        }
        int i2 = AnonymousClass4.onExtraCallbackWithResult[config.ordinal()];
        if (i2 == 1) {
            return onNavigationEvent;
        }
        if (i2 == 2) {
            return onExtraCallback;
        }
        if (i2 == 3) {
            return onExtraCallbackWithResult;
        }
        if (i2 == 4) {
            return onWarmupCompleted;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: o.TextInclusionStrategyCompanionExternalSyntheticLambda2$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallbackWithResult[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallbackWithResult[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
