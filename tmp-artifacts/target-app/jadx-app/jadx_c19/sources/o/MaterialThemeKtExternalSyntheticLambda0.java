package o;

import androidx.media3.extractor.flv.TagPayloadReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MaterialThemeKtExternalSyntheticLambda0 extends TagPayloadReader {
    private long[] IAuthTabCallback;
    private long onExtraCallbackWithResult;
    private long[] onNavigationEvent;

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        return true;
    }

    public MaterialThemeKtExternalSyntheticLambda0() {
        super(new DrawerKtExternalSyntheticLambda6());
        this.onExtraCallbackWithResult = -9223372036854775807L;
        this.onNavigationEvent = new long[0];
        this.IAuthTabCallback = new long[0];
    }

    public long onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public long[] onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public long[] IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j) {
        if (asInterface(textFieldDecoratorModifierNodeExternalSyntheticLambda20) != 2 || !"onMetaData".equals(asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20)) || textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() == 0 || asInterface(textFieldDecoratorModifierNodeExternalSyntheticLambda20) != 8) {
            return false;
        }
        HashMap<String, Object> mapOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        Object obj = mapOnWarmupCompleted.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.onExtraCallbackWithResult = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapOnWarmupCompleted.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.onNavigationEvent = new long[size];
                this.IAuthTabCallback = new long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.onNavigationEvent[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.IAuthTabCallback[i2] = ((Double) obj5).longValue();
                    } else {
                        this.onNavigationEvent = new long[0];
                        this.IAuthTabCallback = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    private static int asInterface(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
    }

    private static Boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        return Boolean.valueOf(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 1);
    }

    private static Double IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        return Double.valueOf(Double.longBitsToDouble(textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject()));
    }

    private static String asBinder(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnUnminimized);
        return new String(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted, iOnUnminimized);
    }

    private static ArrayList<Object> IAuthTabCallbackDefault(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        ArrayList<Object> arrayList = new ArrayList<>(iICustomTabsCallbackDefault);
        for (int i2 = 0; i2 < iICustomTabsCallbackDefault; i2++) {
            Object objOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, asInterface(textFieldDecoratorModifierNodeExternalSyntheticLambda20));
            if (objOnNavigationEvent != null) {
                arrayList.add(objOnNavigationEvent);
            }
        }
        return arrayList;
    }

    private static HashMap<String, Object> IAuthTabCallbackStub(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strAsBinder = asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            int iAsInterface = asInterface(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            if (iAsInterface == 9) {
                return map;
            }
            Object objOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iAsInterface);
            if (objOnNavigationEvent != null) {
                map.put(strAsBinder, objOnNavigationEvent);
            }
        }
    }

    private static HashMap<String, Object> onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        HashMap<String, Object> map = new HashMap<>(iICustomTabsCallbackDefault);
        for (int i2 = 0; i2 < iICustomTabsCallbackDefault; i2++) {
            String strAsBinder = asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            Object objOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, asInterface(textFieldDecoratorModifierNodeExternalSyntheticLambda20));
            if (objOnNavigationEvent != null) {
                map.put(strAsBinder, objOnNavigationEvent);
            }
        }
        return map;
    }

    private static Date onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        Date date = new Date((long) IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20).doubleValue());
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        return date;
    }

    private static Object onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        if (i2 == 0) {
            return IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        if (i2 == 1) {
            return onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        if (i2 == 2) {
            return asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        if (i2 == 3) {
            return IAuthTabCallbackStub(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        if (i2 == 8) {
            return onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        if (i2 == 10) {
            return IAuthTabCallbackDefault(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        if (i2 != 11) {
            return null;
        }
        return onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
    }
}
