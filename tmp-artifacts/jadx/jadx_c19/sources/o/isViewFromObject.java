package o;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import o.internalPathIteratorSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class isViewFromObject implements Serializable {
    private static final TimeZone onNavigationEvent = DesugarTimeZone.getTimeZone("UTC");
    private static final long serialVersionUID = 1;
    protected final internalPathIteratorSize.onNavigationEvent _accessorNaming;
    protected final startActivityFromFragment _annotationIntrospector;
    protected final applyState _cacheProvider;
    protected final nSetCrop _classIntrospector;
    protected final DateFormat _dateFormat;
    protected final getPostOnViewCreatedAlpha _defaultBase64;
    protected final RadioButtonKtRadioButtonElement24 _handlerInstantiator;
    protected final Locale _locale;
    protected final loadFragmentClass _propertyNamingStrategy;
    protected final TimeZone _timeZone;
    protected final LifecycleEffectKtExternalSyntheticLambda4 _typeFactory;
    protected final setPrinter<?> _typeResolverBuilder;
    protected final SurfaceControlCompatTransactionCompletedListener _typeValidator;

    public isViewFromObject(nSetCrop nsetcrop, startActivityFromFragment startactivityfromfragment, loadFragmentClass loadfragmentclass, LifecycleEffectKtExternalSyntheticLambda4 lifecycleEffectKtExternalSyntheticLambda4, setPrinter<?> setprinter, DateFormat dateFormat, RadioButtonKtRadioButtonElement24 radioButtonKtRadioButtonElement24, Locale locale, TimeZone timeZone, getPostOnViewCreatedAlpha getpostonviewcreatedalpha, SurfaceControlCompatTransactionCompletedListener surfaceControlCompatTransactionCompletedListener, internalPathIteratorSize.onNavigationEvent onnavigationevent, applyState applystate) {
        this._classIntrospector = nsetcrop;
        this._annotationIntrospector = startactivityfromfragment;
        this._propertyNamingStrategy = loadfragmentclass;
        this._typeFactory = lifecycleEffectKtExternalSyntheticLambda4;
        this._typeResolverBuilder = setprinter;
        this._dateFormat = dateFormat;
        this._handlerInstantiator = radioButtonKtRadioButtonElement24;
        this._locale = locale;
        this._timeZone = timeZone;
        this._defaultBase64 = getpostonviewcreatedalpha;
        this._typeValidator = surfaceControlCompatTransactionCompletedListener;
        this._accessorNaming = onnavigationevent;
        this._cacheProvider = applystate;
    }

    public isViewFromObject onExtraCallbackWithResult(nSetCrop nsetcrop) {
        return this._classIntrospector == nsetcrop ? this : new isViewFromObject(nsetcrop, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming, this._cacheProvider);
    }

    public nSetCrop onExtraCallbackWithResult() {
        return this._classIntrospector;
    }

    public startActivityFromFragment onExtraCallback() {
        return this._annotationIntrospector;
    }

    public loadFragmentClass onTransact() {
        return this._propertyNamingStrategy;
    }

    public internalPathIteratorSize.onNavigationEvent onWarmupCompleted() {
        return this._accessorNaming;
    }

    public LifecycleEffectKtExternalSyntheticLambda4 IAuthTabCallback_Parcel() {
        return this._typeFactory;
    }

    public setPrinter<?> access100() {
        return this._typeResolverBuilder;
    }

    public SurfaceControlCompatTransactionCompletedListener asInterface() {
        return this._typeValidator;
    }

    public DateFormat IAuthTabCallback() {
        return this._dateFormat;
    }

    public RadioButtonKtRadioButtonElement24 IAuthTabCallbackDefault() {
        return this._handlerInstantiator;
    }

    public Locale asBinder() {
        return this._locale;
    }

    public TimeZone IAuthTabCallbackStub() {
        TimeZone timeZone = this._timeZone;
        return timeZone == null ? onNavigationEvent : timeZone;
    }

    public getPostOnViewCreatedAlpha onNavigationEvent() {
        return this._defaultBase64;
    }
}
