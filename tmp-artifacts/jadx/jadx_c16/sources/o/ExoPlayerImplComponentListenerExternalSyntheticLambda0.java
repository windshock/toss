package o;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ExoPlayerImplComponentListenerExternalSyntheticLambda0 {
    static final ExoPlayerImplComponentListenerExternalSyntheticLambda0 onExtraCallbackWithResult = new ExoPlayerImplComponentListenerExternalSyntheticLambda0();
    public int IAuthTabCallback;
    public final ExoPlayerImplComponentListenerExternalSyntheticLambda4.IAuthTabCallback IAuthTabCallbackDefault;
    public final ExoPlayerImplComponentListenerExternalSyntheticLambda4.onWarmupCompleted IAuthTabCallbackStub;
    public final double IAuthTabCallbackStubProxy;
    public final ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback IAuthTabCallback_Parcel;
    public final boolean access000;
    public final double access100;
    public final double asBinder;
    public ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult asInterface;
    public final double getInterfaceDescriptor;
    public final ReadableMap onExtraCallback;
    public final String onNavigationEvent;
    public final String onTransact;
    public final String onWarmupCompleted;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda4.onTransact readTypedObject;

    private ExoPlayerImplComponentListenerExternalSyntheticLambda0() {
        this.onExtraCallback = null;
        this.onWarmupCompleted = "";
        this.IAuthTabCallbackDefault = ExoPlayerImplComponentListenerExternalSyntheticLambda4.IAuthTabCallback.normal;
        this.asInterface = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.Normal;
        this.IAuthTabCallback = 400;
        this.onNavigationEvent = "";
        this.onTransact = "";
        this.IAuthTabCallbackStub = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onWarmupCompleted.normal;
        this.IAuthTabCallback_Parcel = ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback.start;
        this.readTypedObject = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onTransact.None;
        this.access000 = false;
        this.IAuthTabCallbackStubProxy = 0.0d;
        this.asBinder = 12.0d;
        this.getInterfaceDescriptor = 0.0d;
        this.access100 = 0.0d;
    }

    private double onExtraCallback(ReadableMap readableMap, String str, double d, double d2, double d3) {
        if (readableMap.getType(str) == ReadableType.Number) {
            return readableMap.getDouble(str) * d;
        }
        return ExoPlayerImplComponentListenerExternalSyntheticLambda5.onNavigationEvent(readableMap.getString(str), d3, d, d2);
    }

    private void onNavigationEvent(ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0) {
        this.IAuthTabCallback = exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallback;
        this.asInterface = exoPlayerImplComponentListenerExternalSyntheticLambda0.asInterface;
    }

    private void onNavigationEvent(ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0, double d) {
        long jRound = Math.round(d);
        if (jRound >= 1 && jRound <= 1000) {
            int i = (int) jRound;
            this.IAuthTabCallback = i;
            this.asInterface = onWarmupCompleted.onWarmupCompleted(i);
            return;
        }
        onNavigationEvent(exoPlayerImplComponentListenerExternalSyntheticLambda0);
    }

    ExoPlayerImplComponentListenerExternalSyntheticLambda0(ReadableMap readableMap, ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0, double d) {
        String string;
        String string2;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onWarmupCompleted onwarmupcompletedValueOf;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback exoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallbackValueOf;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onTransact ontransact;
        double dOnExtraCallback;
        double dOnExtraCallback2;
        double d2 = exoPlayerImplComponentListenerExternalSyntheticLambda0.asBinder;
        if (readableMap.hasKey("fontSize")) {
            this.asBinder = onExtraCallback(readableMap, "fontSize", 1.0d, d2, d2);
        } else {
            this.asBinder = d2;
        }
        if (readableMap.hasKey("fontWeight")) {
            if (readableMap.getType("fontWeight") == ReadableType.Number) {
                onNavigationEvent(exoPlayerImplComponentListenerExternalSyntheticLambda0, readableMap.getDouble("fontWeight"));
            } else {
                String string3 = readableMap.getString("fontWeight");
                if (ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.hasEnum(string3)) {
                    int iOnExtraCallback = onWarmupCompleted.onExtraCallback(ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.get(string3), exoPlayerImplComponentListenerExternalSyntheticLambda0);
                    this.IAuthTabCallback = iOnExtraCallback;
                    this.asInterface = onWarmupCompleted.onWarmupCompleted(iOnExtraCallback);
                } else if (string3 != null) {
                    onNavigationEvent(exoPlayerImplComponentListenerExternalSyntheticLambda0, Double.parseDouble(string3));
                } else {
                    onNavigationEvent(exoPlayerImplComponentListenerExternalSyntheticLambda0);
                }
            }
        } else {
            onNavigationEvent(exoPlayerImplComponentListenerExternalSyntheticLambda0);
        }
        this.onExtraCallback = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : exoPlayerImplComponentListenerExternalSyntheticLambda0.onExtraCallback;
        this.onWarmupCompleted = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : exoPlayerImplComponentListenerExternalSyntheticLambda0.onWarmupCompleted;
        this.IAuthTabCallbackDefault = readableMap.hasKey("fontStyle") ? ExoPlayerImplComponentListenerExternalSyntheticLambda4.IAuthTabCallback.valueOf(readableMap.getString("fontStyle")) : exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallbackDefault;
        if (readableMap.hasKey("fontFeatureSettings")) {
            string = readableMap.getString("fontFeatureSettings");
        } else {
            string = exoPlayerImplComponentListenerExternalSyntheticLambda0.onNavigationEvent;
        }
        this.onNavigationEvent = string;
        if (readableMap.hasKey("fontVariationSettings")) {
            string2 = readableMap.getString("fontVariationSettings");
        } else {
            string2 = exoPlayerImplComponentListenerExternalSyntheticLambda0.onTransact;
        }
        this.onTransact = string2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            onwarmupcompletedValueOf = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onWarmupCompleted.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            onwarmupcompletedValueOf = exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallbackStub;
        }
        this.IAuthTabCallbackStub = onwarmupcompletedValueOf;
        if (readableMap.hasKey("textAnchor")) {
            exoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallbackValueOf = ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback.valueOf(readableMap.getString("textAnchor"));
        } else {
            exoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallbackValueOf = exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallback_Parcel;
        }
        this.IAuthTabCallback_Parcel = exoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallbackValueOf;
        if (readableMap.hasKey("textDecoration")) {
            ontransact = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onTransact.getEnum(readableMap.getString("textDecoration"));
        } else {
            ontransact = exoPlayerImplComponentListenerExternalSyntheticLambda0.readTypedObject;
        }
        this.readTypedObject = ontransact;
        boolean zHasKey = readableMap.hasKey("kerning");
        this.access000 = zHasKey || exoPlayerImplComponentListenerExternalSyntheticLambda0.access000;
        this.IAuthTabCallbackStubProxy = zHasKey ? onExtraCallback(readableMap, "kerning", d, this.asBinder, 0.0d) : exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallbackStubProxy;
        if (readableMap.hasKey("wordSpacing")) {
            dOnExtraCallback = onExtraCallback(readableMap, "wordSpacing", d, this.asBinder, 0.0d);
        } else {
            dOnExtraCallback = exoPlayerImplComponentListenerExternalSyntheticLambda0.getInterfaceDescriptor;
        }
        this.getInterfaceDescriptor = dOnExtraCallback;
        if (readableMap.hasKey("letterSpacing")) {
            dOnExtraCallback2 = onExtraCallback(readableMap, "letterSpacing", d, this.asBinder, 0.0d);
        } else {
            dOnExtraCallback2 = exoPlayerImplComponentListenerExternalSyntheticLambda0.access100;
        }
        this.access100 = dOnExtraCallback2;
    }
}
