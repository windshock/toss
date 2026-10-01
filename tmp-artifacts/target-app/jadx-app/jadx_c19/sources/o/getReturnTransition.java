package o;

import com.fasterxml.jackson.core.util.RecyclerPool;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.getView;
import o.getViewLifecycleOwner;
import o.setSharedElementReturnTransition;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getReturnTransition extends isMenuVisible implements Serializable {
    private static final long serialVersionUID = 2;
    protected performStart _characterEscapes;
    protected getSharedElementReturnTransition _errorReportConfiguration;
    protected int _factoryFeatures;
    protected final List<FragmentExternalSyntheticLambda0> _generatorDecorators;
    public int _generatorFeatures;
    public requireContext _inputDecorator;
    protected int _maximumNonEscapedChar;
    public getViewLifecycleOwnerLiveData _objectCodec;
    protected setAllowEnterTransitionOverlap _outputDecorator;
    public int _parserFeatures;
    protected final char _quoteChar;
    protected RecyclerPool<setSharedElementReturnTransition> _recyclerPool;
    protected hasOptionsMenu _rootValueSeparator;
    protected isDetached _streamReadConstraints;
    protected isInLayout _streamWriteConstraints;
    protected transient setSharedElementEnterTransition asInterface;
    protected final transient setMenuVisibility onExtraCallback;
    protected static final int onExtraCallbackWithResult = onWarmupCompleted.collectDefaults();
    protected static final int onWarmupCompleted = getViewLifecycleOwner.onExtraCallbackWithResult.collectDefaults();
    protected static final int IAuthTabCallback = getView.IAuthTabCallback.collectDefaults();
    public static final hasOptionsMenu onNavigationEvent = new requireHost(" ");

    public boolean IAuthTabCallbackDefault() {
        return false;
    }

    public boolean onWarmupCompleted() {
        return false;
    }

    public enum onWarmupCompleted implements r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true),
        CHARSET_DETECTION(true);

        private final boolean _defaultState;

        public static int collectDefaults() {
            int mask = 0;
            for (onWarmupCompleted onwarmupcompleted : values()) {
                if (onwarmupcompleted.enabledByDefault()) {
                    mask |= onwarmupcompleted.getMask();
                }
            }
            return mask;
        }

        onWarmupCompleted(boolean z) {
            this._defaultState = z;
        }

        @Override // o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        @Override // o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo
        public boolean enabledIn(int i2) {
            return (i2 & getMask()) != 0;
        }

        @Override // o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo
        public int getMask() {
            return 1 << ordinal();
        }
    }

    public getReturnTransition() {
        this(null);
    }

    public getReturnTransition(getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata) {
        this.onExtraCallback = setMenuVisibility.onExtraCallbackWithResult();
        this._factoryFeatures = onExtraCallbackWithResult;
        this._parserFeatures = onWarmupCompleted;
        this._generatorFeatures = IAuthTabCallback;
        this._rootValueSeparator = onNavigationEvent;
        this._recyclerPool = dispatchFragmentsOnCreateView.onExtraCallback();
        this._objectCodec = getviewlifecycleownerlivedata;
        this._quoteChar = '\"';
        this._streamReadConstraints = isDetached.IAuthTabCallback();
        this._streamWriteConstraints = isInLayout.onNavigationEvent();
        this._errorReportConfiguration = getSharedElementReturnTransition.IAuthTabCallback();
        this._generatorDecorators = null;
        this.asInterface = setSharedElementEnterTransition.onExtraCallback(this);
    }

    public getReturnTransition(getReturnTransition getreturntransition, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata) {
        this.onExtraCallback = setMenuVisibility.onExtraCallbackWithResult();
        this._factoryFeatures = onExtraCallbackWithResult;
        this._parserFeatures = onWarmupCompleted;
        this._generatorFeatures = IAuthTabCallback;
        this._rootValueSeparator = onNavigationEvent;
        this._recyclerPool = getreturntransition._recyclerPool;
        this._objectCodec = getviewlifecycleownerlivedata;
        this._factoryFeatures = getreturntransition._factoryFeatures;
        this._parserFeatures = getreturntransition._parserFeatures;
        this._generatorFeatures = getreturntransition._generatorFeatures;
        this._inputDecorator = getreturntransition._inputDecorator;
        this._outputDecorator = getreturntransition._outputDecorator;
        this._generatorDecorators = onExtraCallback(getreturntransition._generatorDecorators);
        isDetached isdetached = getreturntransition._streamReadConstraints;
        Objects.requireNonNull(isdetached);
        this._streamReadConstraints = isdetached;
        isInLayout isinlayout = getreturntransition._streamWriteConstraints;
        Objects.requireNonNull(isinlayout);
        this._streamWriteConstraints = isinlayout;
        getSharedElementReturnTransition getsharedelementreturntransition = getreturntransition._errorReportConfiguration;
        Objects.requireNonNull(getsharedelementreturntransition);
        this._errorReportConfiguration = getsharedelementreturntransition;
        this._characterEscapes = getreturntransition._characterEscapes;
        this._rootValueSeparator = getreturntransition._rootValueSeparator;
        this._maximumNonEscapedChar = getreturntransition._maximumNonEscapedChar;
        this._quoteChar = getreturntransition._quoteChar;
        this.asInterface = setSharedElementEnterTransition.onExtraCallback(this);
    }

    protected static <T> List<T> onExtraCallback(List<T> list) {
        return list == null ? list : new ArrayList(list);
    }

    protected Object readResolve() {
        return new getReturnTransition(this, this._objectCodec);
    }

    public String onTransact() {
        if (getClass() == getReturnTransition.class) {
            return "JSON";
        }
        return null;
    }

    public onCreateContextMenu onExtraCallback(onContextItemSelected oncontextitemselected) throws IOException {
        if (getClass() == getReturnTransition.class) {
            return onWarmupCompleted(oncontextitemselected);
        }
        return null;
    }

    public onCreateContextMenu onWarmupCompleted(onContextItemSelected oncontextitemselected) throws IOException {
        return setAnimations.onNavigationEvent(oncontextitemselected);
    }

    @Override // o.isMenuVisible
    public final int onExtraCallback() {
        return this._factoryFeatures;
    }

    @Override // o.isMenuVisible
    public isDetached IAuthTabCallbackStub() {
        return this._streamReadConstraints;
    }

    public final boolean onExtraCallback(getViewLifecycleOwner.onExtraCallbackWithResult onextracallbackwithresult) {
        return (onextracallbackwithresult.getMask() & this._parserFeatures) != 0;
    }

    public getReturnTransition IAuthTabCallback(getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata) {
        this._objectCodec = getviewlifecycleownerlivedata;
        return this;
    }

    public getViewLifecycleOwnerLiveData IAuthTabCallback() {
        return this._objectCodec;
    }

    public getViewLifecycleOwner IAuthTabCallback(InputStream inputStream) throws IOException {
        performViewCreated performviewcreatedIAuthTabCallback = IAuthTabCallback(onWarmupCompleted(inputStream), false);
        return onExtraCallbackWithResult(IAuthTabCallback(inputStream, performviewcreatedIAuthTabCallback), performviewcreatedIAuthTabCallback);
    }

    public getViewLifecycleOwner onExtraCallbackWithResult(byte[] bArr) throws IOException {
        InputStream inputStreamOnWarmupCompleted;
        performViewCreated performviewcreatedIAuthTabCallback = IAuthTabCallback(onWarmupCompleted(bArr), true);
        requireContext requirecontext = this._inputDecorator;
        if (requirecontext != null && (inputStreamOnWarmupCompleted = requirecontext.onWarmupCompleted(performviewcreatedIAuthTabCallback, bArr, 0, bArr.length)) != null) {
            return onExtraCallbackWithResult(inputStreamOnWarmupCompleted, performviewcreatedIAuthTabCallback);
        }
        return onExtraCallbackWithResult(bArr, 0, bArr.length, performviewcreatedIAuthTabCallback);
    }

    public getViewLifecycleOwner onWarmupCompleted(byte[] bArr, int i2, int i3) throws IOException, IllegalArgumentException {
        InputStream inputStreamOnWarmupCompleted;
        IAuthTabCallback(bArr, i2, i3);
        performViewCreated performviewcreatedIAuthTabCallback = IAuthTabCallback(onNavigationEvent(bArr, i2, i3), true);
        requireContext requirecontext = this._inputDecorator;
        if (requirecontext != null && (inputStreamOnWarmupCompleted = requirecontext.onWarmupCompleted(performviewcreatedIAuthTabCallback, bArr, i2, i3)) != null) {
            return onExtraCallbackWithResult(inputStreamOnWarmupCompleted, performviewcreatedIAuthTabCallback);
        }
        return onExtraCallbackWithResult(bArr, i2, i3, performviewcreatedIAuthTabCallback);
    }

    public getView onNavigationEvent(OutputStream outputStream, getSharedElementSourceNames getsharedelementsourcenames) throws IOException {
        performViewCreated performviewcreatedIAuthTabCallback = IAuthTabCallback(onWarmupCompleted(outputStream), false);
        performviewcreatedIAuthTabCallback.onExtraCallback(getsharedelementsourcenames);
        if (getsharedelementsourcenames == getSharedElementSourceNames.UTF8) {
            return onExtraCallbackWithResult(IAuthTabCallback(outputStream, performviewcreatedIAuthTabCallback), performviewcreatedIAuthTabCallback);
        }
        return onExtraCallback(onExtraCallbackWithResult(onWarmupCompleted(outputStream, getsharedelementsourcenames, performviewcreatedIAuthTabCallback), performviewcreatedIAuthTabCallback), performviewcreatedIAuthTabCallback);
    }

    public getView onExtraCallbackWithResult(OutputStream outputStream) throws IOException {
        return onNavigationEvent(outputStream, getSharedElementSourceNames.UTF8);
    }

    public getView onExtraCallbackWithResult(Writer writer) throws IOException {
        performViewCreated performviewcreatedIAuthTabCallback = IAuthTabCallback(onWarmupCompleted(writer), false);
        return onExtraCallback(onExtraCallbackWithResult(writer, performviewcreatedIAuthTabCallback), performviewcreatedIAuthTabCallback);
    }

    protected getViewLifecycleOwner onExtraCallbackWithResult(InputStream inputStream, performViewCreated performviewcreated) throws IOException {
        try {
            return new setAnimations(performviewcreated, inputStream).onWarmupCompleted(this._parserFeatures, this._objectCodec, this.onExtraCallback, this.asInterface, this._factoryFeatures);
        } catch (IOException | RuntimeException e) {
            if (performviewcreated.onTransact()) {
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
            }
            performviewcreated.close();
            throw e;
        }
    }

    protected getViewLifecycleOwner onExtraCallbackWithResult(byte[] bArr, int i2, int i3, performViewCreated performviewcreated) throws IOException {
        return new setAnimations(performviewcreated, bArr, i2, i3).onWarmupCompleted(this._parserFeatures, this._objectCodec, this.onExtraCallback, this.asInterface, this._factoryFeatures);
    }

    protected getView onExtraCallback(Writer writer, performViewCreated performviewcreated) throws IOException {
        setPostOnViewCreatedAlpha setpostonviewcreatedalpha = new setPostOnViewCreatedAlpha(performviewcreated, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i2 = this._maximumNonEscapedChar;
        if (i2 > 0) {
            setpostonviewcreatedalpha.onExtraCallback(i2);
        }
        performStart performstart = this._characterEscapes;
        if (performstart != null) {
            setpostonviewcreatedalpha.IAuthTabCallback(performstart);
        }
        hasOptionsMenu hasoptionsmenu = this._rootValueSeparator;
        if (hasoptionsmenu != onNavigationEvent) {
            setpostonviewcreatedalpha.onWarmupCompleted(hasoptionsmenu);
        }
        return onNavigationEvent(setpostonviewcreatedalpha);
    }

    protected getView onExtraCallbackWithResult(OutputStream outputStream, performViewCreated performviewcreated) throws IOException {
        setReenterTransition setreentertransition = new setReenterTransition(performviewcreated, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i2 = this._maximumNonEscapedChar;
        if (i2 > 0) {
            setreentertransition.onExtraCallback(i2);
        }
        performStart performstart = this._characterEscapes;
        if (performstart != null) {
            setreentertransition.IAuthTabCallback(performstart);
        }
        hasOptionsMenu hasoptionsmenu = this._rootValueSeparator;
        if (hasoptionsmenu != onNavigationEvent) {
            setreentertransition.onWarmupCompleted(hasoptionsmenu);
        }
        return onNavigationEvent(setreentertransition);
    }

    protected Writer onWarmupCompleted(OutputStream outputStream, getSharedElementSourceNames getsharedelementsourcenames, performViewCreated performviewcreated) throws IOException {
        if (getsharedelementsourcenames == getSharedElementSourceNames.UTF8) {
            return new restoreChildFragmentState(performviewcreated, outputStream);
        }
        return new OutputStreamWriter(outputStream, getsharedelementsourcenames.getJavaName());
    }

    public final InputStream IAuthTabCallback(InputStream inputStream, performViewCreated performviewcreated) throws IOException {
        InputStream inputStreamOnWarmupCompleted;
        requireContext requirecontext = this._inputDecorator;
        return (requirecontext == null || (inputStreamOnWarmupCompleted = requirecontext.onWarmupCompleted(performviewcreated, inputStream)) == null) ? inputStream : inputStreamOnWarmupCompleted;
    }

    public final OutputStream IAuthTabCallback(OutputStream outputStream, performViewCreated performviewcreated) throws IOException {
        OutputStream outputStreamIAuthTabCallback;
        setAllowEnterTransitionOverlap setallowentertransitionoverlap = this._outputDecorator;
        return (setallowentertransitionoverlap == null || (outputStreamIAuthTabCallback = setallowentertransitionoverlap.IAuthTabCallback(performviewcreated, outputStream)) == null) ? outputStream : outputStreamIAuthTabCallback;
    }

    public final Writer onExtraCallbackWithResult(Writer writer, performViewCreated performviewcreated) throws IOException {
        Writer writerOnNavigationEvent;
        setAllowEnterTransitionOverlap setallowentertransitionoverlap = this._outputDecorator;
        return (setallowentertransitionoverlap == null || (writerOnNavigationEvent = setallowentertransitionoverlap.onNavigationEvent(performviewcreated, writer)) == null) ? writer : writerOnNavigationEvent;
    }

    protected getView onNavigationEvent(getView getview) {
        List<FragmentExternalSyntheticLambda0> list = this._generatorDecorators;
        if (list != null) {
            Iterator<FragmentExternalSyntheticLambda0> it = list.iterator();
            while (it.hasNext()) {
                getview = it.next().IAuthTabCallback(this, getview);
            }
        }
        return getview;
    }

    public setSharedElementReturnTransition onNavigationEvent() {
        return (setSharedElementReturnTransition) onExtraCallbackWithResult().asBinder();
    }

    public RecyclerPool<setSharedElementReturnTransition> onExtraCallbackWithResult() {
        if (!onWarmupCompleted.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures)) {
            return dispatchFragmentsOnCreateView.onWarmupCompleted();
        }
        return this._recyclerPool;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public performViewCreated IAuthTabCallback(registerForContextMenu registerforcontextmenu, boolean z) {
        boolean z2;
        setSharedElementReturnTransition setsharedelementreturntransitionOnWarmupCompleted = null;
        if (registerforcontextmenu == null) {
            registerforcontextmenu = registerForContextMenu.onExtraCallbackWithResult();
        } else {
            Object objIAuthTabCallbackDefault = registerforcontextmenu.IAuthTabCallbackDefault();
            if ((objIAuthTabCallbackDefault instanceof setSharedElementReturnTransition.IAuthTabCallback) && (setsharedelementreturntransitionOnWarmupCompleted = ((setSharedElementReturnTransition.IAuthTabCallback) objIAuthTabCallbackDefault).onWarmupCompleted()) != null) {
                z2 = true;
            }
            performViewCreated performviewcreated = new performViewCreated(this._streamReadConstraints, this._streamWriteConstraints, this._errorReportConfiguration, setsharedelementreturntransitionOnWarmupCompleted != null ? onNavigationEvent() : setsharedelementreturntransitionOnWarmupCompleted, registerforcontextmenu, z);
            if (z2) {
                performviewcreated.getInterfaceDescriptor();
            }
            return performviewcreated;
        }
        z2 = false;
        performViewCreated performviewcreated2 = new performViewCreated(this._streamReadConstraints, this._streamWriteConstraints, this._errorReportConfiguration, setsharedelementreturntransitionOnWarmupCompleted != null ? onNavigationEvent() : setsharedelementreturntransitionOnWarmupCompleted, registerforcontextmenu, z);
        if (z2) {
        }
        return performviewcreated2;
    }

    public registerForContextMenu onWarmupCompleted(Object obj) {
        return registerForContextMenu.onExtraCallbackWithResult(!onWarmupCompleted(), obj, this._errorReportConfiguration);
    }

    public registerForContextMenu onNavigationEvent(Object obj, int i2, int i3) {
        return registerForContextMenu.IAuthTabCallback(!onWarmupCompleted(), obj, i2, i3, this._errorReportConfiguration);
    }
}
