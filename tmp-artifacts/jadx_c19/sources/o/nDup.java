package o;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class nDup extends SurfaceControlV33TransactionExternalSyntheticLambda2 implements Serializable {
    private static final long serialVersionUID = 1;
    protected LinkedHashSet<SurfaceControlV33TransactionExternalSyntheticLambda1> _registeredSubtypes;

    @Override // o.SurfaceControlV33TransactionExternalSyntheticLambda2
    public Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nCreate ncreate, JavaType javaType) {
        Class<?> clsOnNavigationEvent;
        List<SurfaceControlV33TransactionExternalSyntheticLambda1> listOnRelationshipValidationResult;
        startActivityFromFragment startactivityfromfragmentAsBinder = radioButtonKtRadioButtonElement27.asBinder();
        if (javaType != null) {
            clsOnNavigationEvent = javaType.asBinder();
        } else if (ncreate != null) {
            clsOnNavigationEvent = ncreate.onNavigationEvent();
        } else {
            throw new IllegalArgumentException("Both property and base type are nulls");
        }
        HashMap<SurfaceControlV33TransactionExternalSyntheticLambda1, SurfaceControlV33TransactionExternalSyntheticLambda1> map = new HashMap<>();
        LinkedHashSet<SurfaceControlV33TransactionExternalSyntheticLambda1> linkedHashSet = this._registeredSubtypes;
        if (linkedHashSet != null) {
            Iterator<SurfaceControlV33TransactionExternalSyntheticLambda1> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                SurfaceControlV33TransactionExternalSyntheticLambda1 next = it.next();
                if (clsOnNavigationEvent.isAssignableFrom(next.onNavigationEvent())) {
                    onNavigationEvent(RoundedCorner.IAuthTabCallback(radioButtonKtRadioButtonElement27, (Class<?>) next.onNavigationEvent()), next, radioButtonKtRadioButtonElement27, startactivityfromfragmentAsBinder, map);
                }
            }
        }
        if (ncreate != null && (listOnRelationshipValidationResult = startactivityfromfragmentAsBinder.onRelationshipValidationResult(ncreate)) != null) {
            for (SurfaceControlV33TransactionExternalSyntheticLambda1 surfaceControlV33TransactionExternalSyntheticLambda1 : listOnRelationshipValidationResult) {
                onNavigationEvent(RoundedCorner.IAuthTabCallback(radioButtonKtRadioButtonElement27, (Class<?>) surfaceControlV33TransactionExternalSyntheticLambda1.onNavigationEvent()), surfaceControlV33TransactionExternalSyntheticLambda1, radioButtonKtRadioButtonElement27, startactivityfromfragmentAsBinder, map);
            }
        }
        onNavigationEvent(RoundedCorner.IAuthTabCallback(radioButtonKtRadioButtonElement27, clsOnNavigationEvent), new SurfaceControlV33TransactionExternalSyntheticLambda1(clsOnNavigationEvent, (String) null), radioButtonKtRadioButtonElement27, startactivityfromfragmentAsBinder, map);
        return new ArrayList(map.values());
    }

    @Override // o.SurfaceControlV33TransactionExternalSyntheticLambda2
    public Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        startActivityFromFragment startactivityfromfragmentAsBinder = radioButtonKtRadioButtonElement27.asBinder();
        HashMap<SurfaceControlV33TransactionExternalSyntheticLambda1, SurfaceControlV33TransactionExternalSyntheticLambda1> map = new HashMap<>();
        if (this._registeredSubtypes != null) {
            Class<?> clsOnNavigationEvent = angleMeasurerExternalSyntheticLambda0.onNavigationEvent();
            Iterator<SurfaceControlV33TransactionExternalSyntheticLambda1> it = this._registeredSubtypes.iterator();
            while (it.hasNext()) {
                SurfaceControlV33TransactionExternalSyntheticLambda1 next = it.next();
                if (clsOnNavigationEvent.isAssignableFrom(next.onNavigationEvent())) {
                    onNavigationEvent(RoundedCorner.IAuthTabCallback(radioButtonKtRadioButtonElement27, (Class<?>) next.onNavigationEvent()), next, radioButtonKtRadioButtonElement27, startactivityfromfragmentAsBinder, map);
                }
            }
        }
        onNavigationEvent(angleMeasurerExternalSyntheticLambda0, new SurfaceControlV33TransactionExternalSyntheticLambda1(angleMeasurerExternalSyntheticLambda0.onNavigationEvent(), (String) null), radioButtonKtRadioButtonElement27, startactivityfromfragmentAsBinder, map);
        return new ArrayList(map.values());
    }

    @Override // o.SurfaceControlV33TransactionExternalSyntheticLambda2
    public Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nCreate ncreate, JavaType javaType) {
        List<SurfaceControlV33TransactionExternalSyntheticLambda1> listOnRelationshipValidationResult;
        startActivityFromFragment startactivityfromfragmentAsBinder = radioButtonKtRadioButtonElement27.asBinder();
        Class<?> clsAsBinder = javaType.asBinder();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        onExtraCallbackWithResult(RoundedCorner.IAuthTabCallback(radioButtonKtRadioButtonElement27, clsAsBinder), new SurfaceControlV33TransactionExternalSyntheticLambda1(clsAsBinder, (String) null), radioButtonKtRadioButtonElement27, linkedHashSet, linkedHashMap);
        if (ncreate != null && (listOnRelationshipValidationResult = startactivityfromfragmentAsBinder.onRelationshipValidationResult(ncreate)) != null) {
            for (SurfaceControlV33TransactionExternalSyntheticLambda1 surfaceControlV33TransactionExternalSyntheticLambda1 : listOnRelationshipValidationResult) {
                onExtraCallbackWithResult(RoundedCorner.IAuthTabCallback(radioButtonKtRadioButtonElement27, (Class<?>) surfaceControlV33TransactionExternalSyntheticLambda1.onNavigationEvent()), surfaceControlV33TransactionExternalSyntheticLambda1, radioButtonKtRadioButtonElement27, linkedHashSet, linkedHashMap);
            }
        }
        LinkedHashSet<SurfaceControlV33TransactionExternalSyntheticLambda1> linkedHashSet2 = this._registeredSubtypes;
        if (linkedHashSet2 != null) {
            Iterator<SurfaceControlV33TransactionExternalSyntheticLambda1> it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                SurfaceControlV33TransactionExternalSyntheticLambda1 next = it.next();
                if (clsAsBinder.isAssignableFrom(next.onNavigationEvent())) {
                    onExtraCallbackWithResult(RoundedCorner.IAuthTabCallback(radioButtonKtRadioButtonElement27, (Class<?>) next.onNavigationEvent()), next, radioButtonKtRadioButtonElement27, linkedHashSet, linkedHashMap);
                }
            }
        }
        return onNavigationEvent(clsAsBinder, linkedHashSet, linkedHashMap);
    }

    @Override // o.SurfaceControlV33TransactionExternalSyntheticLambda2
    public Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        Class<?> clsOnNavigationEvent = angleMeasurerExternalSyntheticLambda0.onNavigationEvent();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        onExtraCallbackWithResult(angleMeasurerExternalSyntheticLambda0, new SurfaceControlV33TransactionExternalSyntheticLambda1(clsOnNavigationEvent, (String) null), radioButtonKtRadioButtonElement27, linkedHashSet, linkedHashMap);
        LinkedHashSet<SurfaceControlV33TransactionExternalSyntheticLambda1> linkedHashSet2 = this._registeredSubtypes;
        if (linkedHashSet2 != null) {
            Iterator<SurfaceControlV33TransactionExternalSyntheticLambda1> it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                SurfaceControlV33TransactionExternalSyntheticLambda1 next = it.next();
                if (clsOnNavigationEvent.isAssignableFrom(next.onNavigationEvent())) {
                    onExtraCallbackWithResult(RoundedCorner.IAuthTabCallback(radioButtonKtRadioButtonElement27, (Class<?>) next.onNavigationEvent()), next, radioButtonKtRadioButtonElement27, linkedHashSet, linkedHashMap);
                }
            }
        }
        return onNavigationEvent(clsOnNavigationEvent, linkedHashSet, linkedHashMap);
    }

    protected void onNavigationEvent(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, SurfaceControlV33TransactionExternalSyntheticLambda1 surfaceControlV33TransactionExternalSyntheticLambda1, RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, startActivityFromFragment startactivityfromfragment, HashMap<SurfaceControlV33TransactionExternalSyntheticLambda1, SurfaceControlV33TransactionExternalSyntheticLambda1> map) {
        String strAsBinder;
        if (!surfaceControlV33TransactionExternalSyntheticLambda1.onWarmupCompleted() && (strAsBinder = startactivityfromfragment.asBinder(angleMeasurerExternalSyntheticLambda0)) != null) {
            surfaceControlV33TransactionExternalSyntheticLambda1 = new SurfaceControlV33TransactionExternalSyntheticLambda1(surfaceControlV33TransactionExternalSyntheticLambda1.onNavigationEvent(), strAsBinder);
        }
        SurfaceControlV33TransactionExternalSyntheticLambda1 surfaceControlV33TransactionExternalSyntheticLambda12 = new SurfaceControlV33TransactionExternalSyntheticLambda1(surfaceControlV33TransactionExternalSyntheticLambda1.onNavigationEvent());
        if (map.containsKey(surfaceControlV33TransactionExternalSyntheticLambda12)) {
            if (!surfaceControlV33TransactionExternalSyntheticLambda1.onWarmupCompleted() || map.get(surfaceControlV33TransactionExternalSyntheticLambda12).onWarmupCompleted()) {
                return;
            }
            map.put(surfaceControlV33TransactionExternalSyntheticLambda12, surfaceControlV33TransactionExternalSyntheticLambda1);
            return;
        }
        map.put(surfaceControlV33TransactionExternalSyntheticLambda12, surfaceControlV33TransactionExternalSyntheticLambda1);
        List<SurfaceControlV33TransactionExternalSyntheticLambda1> listOnRelationshipValidationResult = startactivityfromfragment.onRelationshipValidationResult(angleMeasurerExternalSyntheticLambda0);
        if (listOnRelationshipValidationResult == null || listOnRelationshipValidationResult.isEmpty()) {
            return;
        }
        for (SurfaceControlV33TransactionExternalSyntheticLambda1 surfaceControlV33TransactionExternalSyntheticLambda13 : listOnRelationshipValidationResult) {
            onNavigationEvent(RoundedCorner.IAuthTabCallback(radioButtonKtRadioButtonElement27, (Class<?>) surfaceControlV33TransactionExternalSyntheticLambda13.onNavigationEvent()), surfaceControlV33TransactionExternalSyntheticLambda13, radioButtonKtRadioButtonElement27, startactivityfromfragment, map);
        }
    }

    protected void onExtraCallbackWithResult(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, SurfaceControlV33TransactionExternalSyntheticLambda1 surfaceControlV33TransactionExternalSyntheticLambda1, RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, Set<Class<?>> set, Map<String, SurfaceControlV33TransactionExternalSyntheticLambda1> map) {
        List<SurfaceControlV33TransactionExternalSyntheticLambda1> listOnRelationshipValidationResult;
        String strAsBinder;
        startActivityFromFragment startactivityfromfragmentAsBinder = radioButtonKtRadioButtonElement27.asBinder();
        if (!surfaceControlV33TransactionExternalSyntheticLambda1.onWarmupCompleted() && (strAsBinder = startactivityfromfragmentAsBinder.asBinder(angleMeasurerExternalSyntheticLambda0)) != null) {
            surfaceControlV33TransactionExternalSyntheticLambda1 = new SurfaceControlV33TransactionExternalSyntheticLambda1(surfaceControlV33TransactionExternalSyntheticLambda1.onNavigationEvent(), strAsBinder);
        }
        if (surfaceControlV33TransactionExternalSyntheticLambda1.onWarmupCompleted()) {
            map.put(surfaceControlV33TransactionExternalSyntheticLambda1.onExtraCallbackWithResult(), surfaceControlV33TransactionExternalSyntheticLambda1);
        }
        if (!set.add(surfaceControlV33TransactionExternalSyntheticLambda1.onNavigationEvent()) || (listOnRelationshipValidationResult = startactivityfromfragmentAsBinder.onRelationshipValidationResult(angleMeasurerExternalSyntheticLambda0)) == null || listOnRelationshipValidationResult.isEmpty()) {
            return;
        }
        for (SurfaceControlV33TransactionExternalSyntheticLambda1 surfaceControlV33TransactionExternalSyntheticLambda12 : listOnRelationshipValidationResult) {
            onExtraCallbackWithResult(RoundedCorner.IAuthTabCallback(radioButtonKtRadioButtonElement27, (Class<?>) surfaceControlV33TransactionExternalSyntheticLambda12.onNavigationEvent()), surfaceControlV33TransactionExternalSyntheticLambda12, radioButtonKtRadioButtonElement27, set, map);
        }
    }

    protected Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onNavigationEvent(Class<?> cls, Set<Class<?>> set, Map<String, SurfaceControlV33TransactionExternalSyntheticLambda1> map) {
        ArrayList arrayList = new ArrayList(map.values());
        Iterator<SurfaceControlV33TransactionExternalSyntheticLambda1> it = map.values().iterator();
        while (it.hasNext()) {
            set.remove(it.next().onNavigationEvent());
        }
        for (Class<?> cls2 : set) {
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new SurfaceControlV33TransactionExternalSyntheticLambda1(cls2));
            }
        }
        return arrayList;
    }
}
