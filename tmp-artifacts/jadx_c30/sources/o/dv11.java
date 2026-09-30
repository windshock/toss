package o;

import java.util.HashMap;
import java.util.Map;
import org.bson.RawBsonDocument;
import org.bson.codecs.RawBsonDocumentCodec;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv11 implements dv4 {
    private static final setClosedListenerKey onExtraCallback;
    private final Map<Class<?>, dv12<?>> onNavigationEvent = new HashMap();

    public dv11() {
        onWarmupCompleted();
    }

    public static Class<? extends jc2> onExtraCallback(t_ t_Var) {
        return onExtraCallback.onExtraCallback(t_Var);
    }

    public static setClosedListenerKey IAuthTabCallback() {
        return onExtraCallback;
    }

    @Override // o.dv4
    public <T> dv12<T> onExtraCallbackWithResult(Class<T> cls, dv18 dv18Var) {
        if (this.onNavigationEvent.containsKey(cls)) {
            return (dv12) this.onNavigationEvent.get(cls);
        }
        if (cls == getOutline.class) {
            return new avzb(dv18Var.onNavigationEvent(getButtonTextForNewStyleBar.class));
        }
        if (cls == jc2.class) {
            return new dv10(dv18Var);
        }
        if (cls == setWidthOrHeightInParentRatio.class) {
            return new ul21(dv18Var.onNavigationEvent(getButtonTextForNewStyleBar.class));
        }
        if (cls == RawBsonDocument.class) {
            return new RawBsonDocumentCodec();
        }
        if (getButtonTextForNewStyleBar.class.isAssignableFrom(cls)) {
            return new pmi5(dv18Var);
        }
        if (initViewsDefault.class.isAssignableFrom(cls)) {
            return new pmi12(dv18Var);
        }
        return null;
    }

    private void onWarmupCompleted() {
        onWarmupCompleted(new putOpt());
        onWarmupCompleted(new pmi4());
        onWarmupCompleted(new pmi7());
        onWarmupCompleted(new pmi6());
        onWarmupCompleted(new pmi8());
        onWarmupCompleted(new avycx());
        onWarmupCompleted(new xkz4());
        onWarmupCompleted(new ul6());
        onWarmupCompleted(new pmi9());
        onWarmupCompleted(new setExpressInteractionListener());
        onWarmupCompleted(new setIsShow());
        onWarmupCompleted(new xkz3());
        onWarmupCompleted(new getCurView());
        onWarmupCompleted(new ycx71());
        onWarmupCompleted(new setSwiperVisibleChangeListener());
        onWarmupCompleted(new setSwiperWindowFocusChangedListener());
        onWarmupCompleted(new getVideoModel());
        onWarmupCompleted(new dv1());
    }

    private <T extends jc2> void onWarmupCompleted(dv12<T> dv12Var) {
        this.onNavigationEvent.put(dv12Var.onNavigationEvent(), dv12Var);
    }

    static {
        HashMap map = new HashMap();
        map.put(t_.NULL, wiezb.class);
        map.put(t_.ARRAY, initViewsDefault.class);
        map.put(t_.BINARY, initOneSlotMultipleAdsLayoutLandscape.class);
        map.put(t_.BOOLEAN, RFEndCardBackUpLayout1.class);
        map.put(t_.DATE_TIME, getCnOrEnBtnText.class);
        map.put(t_.DB_POINTER, RFEndCardBackUpLayout2.class);
        map.put(t_.DOCUMENT, getButtonTextForNewStyleBar.class);
        map.put(t_.DOUBLE, getBackupContainerBackgroundView.class);
        map.put(t_.INT32, setWidthAndHeightRatio.class);
        map.put(t_.INT64, wie5.class);
        map.put(t_.DECIMAL128, ea2.class);
        map.put(t_.MAX_KEY, wie6.class);
        map.put(t_.MIN_KEY, wiezb1.class);
        map.put(t_.JAVASCRIPT, wie4.class);
        map.put(t_.JAVASCRIPT_WITH_SCOPE, getOutline.class);
        map.put(t_.OBJECT_ID, ycxdj1.class);
        map.put(t_.REGULAR_EXPRESSION, ea41.class);
        map.put(t_.STRING, ea4.class);
        map.put(t_.SYMBOL, htf4.class);
        map.put(t_.TIMESTAMP, p_.class);
        map.put(t_.UNDEFINED, jc4.class);
        onExtraCallback = new setClosedListenerKey(map);
    }
}
