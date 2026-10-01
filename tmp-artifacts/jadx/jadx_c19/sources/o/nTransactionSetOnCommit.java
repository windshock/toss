package o;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import o.getMinimumMaxLifecycleState;
import o.nTransactionSetOnCommit;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface nTransactionSetOnCommit<T extends nTransactionSetOnCommit<T>> {
    T IAuthTabCallback(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult);

    T IAuthTabCallback(getMinimumMaxLifecycleState getminimummaxlifecyclestate);

    boolean IAuthTabCallback(RoundedPolygonKt roundedPolygonKt);

    boolean IAuthTabCallback(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd);

    T onExtraCallback(getMinimumMaxLifecycleState.IAuthTabCallback iAuthTabCallback);

    T onExtraCallback(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult);

    boolean onExtraCallback(nCreate ncreate);

    boolean onExtraCallback(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd);

    T onExtraCallbackWithResult(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult);

    boolean onExtraCallbackWithResult(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd);

    T onNavigationEvent(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult);

    T onWarmupCompleted(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult);

    public static class onWarmupCompleted implements nTransactionSetOnCommit<onWarmupCompleted>, Serializable {
        protected static final onWarmupCompleted IAuthTabCallback;
        protected static final onWarmupCompleted onNavigationEvent;
        private static final long serialVersionUID = 1;
        protected final getMinimumMaxLifecycleState$onExtraCallbackWithResult _creatorMinLevel;
        protected final getMinimumMaxLifecycleState$onExtraCallbackWithResult _fieldMinLevel;
        protected final getMinimumMaxLifecycleState$onExtraCallbackWithResult _getterMinLevel;
        protected final getMinimumMaxLifecycleState$onExtraCallbackWithResult _isGetterMinLevel;
        protected final getMinimumMaxLifecycleState$onExtraCallbackWithResult _setterMinLevel;

        static {
            getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult = getMinimumMaxLifecycleState$onExtraCallbackWithResult.PUBLIC_ONLY;
            getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult2 = getMinimumMaxLifecycleState$onExtraCallbackWithResult.ANY;
            IAuthTabCallback = new onWarmupCompleted(getminimummaxlifecyclestate_onextracallbackwithresult, getminimummaxlifecyclestate_onextracallbackwithresult, getminimummaxlifecyclestate_onextracallbackwithresult2, getminimummaxlifecyclestate_onextracallbackwithresult2, getminimummaxlifecyclestate_onextracallbackwithresult);
            onNavigationEvent = new onWarmupCompleted(getminimummaxlifecyclestate_onextracallbackwithresult, getminimummaxlifecyclestate_onextracallbackwithresult, getminimummaxlifecyclestate_onextracallbackwithresult, getminimummaxlifecyclestate_onextracallbackwithresult, getminimummaxlifecyclestate_onextracallbackwithresult);
        }

        public static onWarmupCompleted onNavigationEvent() {
            return IAuthTabCallback;
        }

        public static onWarmupCompleted onWarmupCompleted() {
            return onNavigationEvent;
        }

        public onWarmupCompleted(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult, getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult2, getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult3, getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult4, getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult5) {
            this._getterMinLevel = getminimummaxlifecyclestate_onextracallbackwithresult;
            this._isGetterMinLevel = getminimummaxlifecyclestate_onextracallbackwithresult2;
            this._setterMinLevel = getminimummaxlifecyclestate_onextracallbackwithresult3;
            this._creatorMinLevel = getminimummaxlifecyclestate_onextracallbackwithresult4;
            this._fieldMinLevel = getminimummaxlifecyclestate_onextracallbackwithresult5;
        }

        protected onWarmupCompleted onNavigationEvent(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult, getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult2, getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult3, getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult4, getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult5) {
            return (getminimummaxlifecyclestate_onextracallbackwithresult == this._getterMinLevel && getminimummaxlifecyclestate_onextracallbackwithresult2 == this._isGetterMinLevel && getminimummaxlifecyclestate_onextracallbackwithresult3 == this._setterMinLevel && getminimummaxlifecyclestate_onextracallbackwithresult4 == this._creatorMinLevel && getminimummaxlifecyclestate_onextracallbackwithresult5 == this._fieldMinLevel) ? this : new onWarmupCompleted(getminimummaxlifecyclestate_onextracallbackwithresult, getminimummaxlifecyclestate_onextracallbackwithresult2, getminimummaxlifecyclestate_onextracallbackwithresult3, getminimummaxlifecyclestate_onextracallbackwithresult4, getminimummaxlifecyclestate_onextracallbackwithresult5);
        }

        @Override // o.nTransactionSetOnCommit
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public onWarmupCompleted IAuthTabCallback(getMinimumMaxLifecycleState getminimummaxlifecyclestate) {
            return getminimummaxlifecyclestate != null ? onNavigationEvent(IAuthTabCallback(this._getterMinLevel, getminimummaxlifecyclestate.onWarmupCompleted()), IAuthTabCallback(this._isGetterMinLevel, getminimummaxlifecyclestate.onExtraCallback()), IAuthTabCallback(this._setterMinLevel, getminimummaxlifecyclestate.onExtraCallbackWithResult()), IAuthTabCallback(this._creatorMinLevel, getminimummaxlifecyclestate.IAuthTabCallback()), IAuthTabCallback(this._fieldMinLevel, getminimummaxlifecyclestate.onNavigationEvent())) : this;
        }

        @Override // o.nTransactionSetOnCommit
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public onWarmupCompleted onExtraCallback(getMinimumMaxLifecycleState.IAuthTabCallback iAuthTabCallback) {
            return iAuthTabCallback != null ? onNavigationEvent(IAuthTabCallback(this._getterMinLevel, iAuthTabCallback.onWarmupCompleted()), IAuthTabCallback(this._isGetterMinLevel, iAuthTabCallback.IAuthTabCallback()), IAuthTabCallback(this._setterMinLevel, iAuthTabCallback.onExtraCallbackWithResult()), IAuthTabCallback(this._creatorMinLevel, iAuthTabCallback.onExtraCallback()), IAuthTabCallback(this._fieldMinLevel, iAuthTabCallback.onNavigationEvent())) : this;
        }

        private getMinimumMaxLifecycleState$onExtraCallbackWithResult IAuthTabCallback(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult, getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult2) {
            return getminimummaxlifecyclestate_onextracallbackwithresult2 == getMinimumMaxLifecycleState$onExtraCallbackWithResult.DEFAULT ? getminimummaxlifecyclestate_onextracallbackwithresult : getminimummaxlifecyclestate_onextracallbackwithresult2;
        }

        @Override // o.nTransactionSetOnCommit
        /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
        public onWarmupCompleted onExtraCallbackWithResult(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult) {
            if (getminimummaxlifecyclestate_onextracallbackwithresult == getMinimumMaxLifecycleState$onExtraCallbackWithResult.DEFAULT) {
                getminimummaxlifecyclestate_onextracallbackwithresult = IAuthTabCallback._getterMinLevel;
            }
            getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult2 = getminimummaxlifecyclestate_onextracallbackwithresult;
            return this._getterMinLevel == getminimummaxlifecyclestate_onextracallbackwithresult2 ? this : new onWarmupCompleted(getminimummaxlifecyclestate_onextracallbackwithresult2, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
        }

        @Override // o.nTransactionSetOnCommit
        /* renamed from: IAuthTabCallbackStub, reason: merged with bridge method [inline-methods] */
        public onWarmupCompleted IAuthTabCallback(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult) {
            if (getminimummaxlifecyclestate_onextracallbackwithresult == getMinimumMaxLifecycleState$onExtraCallbackWithResult.DEFAULT) {
                getminimummaxlifecyclestate_onextracallbackwithresult = IAuthTabCallback._isGetterMinLevel;
            }
            getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult2 = getminimummaxlifecyclestate_onextracallbackwithresult;
            return this._isGetterMinLevel == getminimummaxlifecyclestate_onextracallbackwithresult2 ? this : new onWarmupCompleted(this._getterMinLevel, getminimummaxlifecyclestate_onextracallbackwithresult2, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
        }

        @Override // o.nTransactionSetOnCommit
        /* renamed from: asBinder, reason: merged with bridge method [inline-methods] */
        public onWarmupCompleted onNavigationEvent(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult) {
            if (getminimummaxlifecyclestate_onextracallbackwithresult == getMinimumMaxLifecycleState$onExtraCallbackWithResult.DEFAULT) {
                getminimummaxlifecyclestate_onextracallbackwithresult = IAuthTabCallback._setterMinLevel;
            }
            getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult2 = getminimummaxlifecyclestate_onextracallbackwithresult;
            return this._setterMinLevel == getminimummaxlifecyclestate_onextracallbackwithresult2 ? this : new onWarmupCompleted(this._getterMinLevel, this._isGetterMinLevel, getminimummaxlifecyclestate_onextracallbackwithresult2, this._creatorMinLevel, this._fieldMinLevel);
        }

        @Override // o.nTransactionSetOnCommit
        /* renamed from: asInterface, reason: merged with bridge method [inline-methods] */
        public onWarmupCompleted onWarmupCompleted(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult) {
            if (getminimummaxlifecyclestate_onextracallbackwithresult == getMinimumMaxLifecycleState$onExtraCallbackWithResult.DEFAULT) {
                getminimummaxlifecyclestate_onextracallbackwithresult = IAuthTabCallback._creatorMinLevel;
            }
            getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult2 = getminimummaxlifecyclestate_onextracallbackwithresult;
            return this._creatorMinLevel == getminimummaxlifecyclestate_onextracallbackwithresult2 ? this : new onWarmupCompleted(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, getminimummaxlifecyclestate_onextracallbackwithresult2, this._fieldMinLevel);
        }

        @Override // o.nTransactionSetOnCommit
        /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
        public onWarmupCompleted onExtraCallback(getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult) {
            if (getminimummaxlifecyclestate_onextracallbackwithresult == getMinimumMaxLifecycleState$onExtraCallbackWithResult.DEFAULT) {
                getminimummaxlifecyclestate_onextracallbackwithresult = IAuthTabCallback._fieldMinLevel;
            }
            getMinimumMaxLifecycleState$onExtraCallbackWithResult getminimummaxlifecyclestate_onextracallbackwithresult2 = getminimummaxlifecyclestate_onextracallbackwithresult;
            return this._fieldMinLevel == getminimummaxlifecyclestate_onextracallbackwithresult2 ? this : new onWarmupCompleted(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, getminimummaxlifecyclestate_onextracallbackwithresult2);
        }

        public boolean onExtraCallback(Member member) {
            return this._creatorMinLevel.isVisible(member);
        }

        @Override // o.nTransactionSetOnCommit
        public boolean onExtraCallback(nCreate ncreate) {
            return onExtraCallback(ncreate.IAuthTabCallbackStub());
        }

        public boolean onExtraCallbackWithResult(Field field) {
            return this._fieldMinLevel.isVisible(field);
        }

        @Override // o.nTransactionSetOnCommit
        public boolean IAuthTabCallback(RoundedPolygonKt roundedPolygonKt) {
            return onExtraCallbackWithResult(roundedPolygonKt.asInterface());
        }

        public boolean onWarmupCompleted(Method method) {
            return this._getterMinLevel.isVisible(method);
        }

        @Override // o.nTransactionSetOnCommit
        public boolean onExtraCallback(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd) {
            return onWarmupCompleted(ngetpreviousreleasefencefd.IAuthTabCallbackDefault());
        }

        public boolean onNavigationEvent(Method method) {
            return this._isGetterMinLevel.isVisible(method);
        }

        @Override // o.nTransactionSetOnCommit
        public boolean onExtraCallbackWithResult(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd) {
            return onNavigationEvent(ngetpreviousreleasefencefd.IAuthTabCallbackDefault());
        }

        public boolean onExtraCallback(Method method) {
            return this._setterMinLevel.isVisible(method);
        }

        @Override // o.nTransactionSetOnCommit
        public boolean IAuthTabCallback(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd) {
            return onExtraCallback(ngetpreviousreleasefencefd.IAuthTabCallbackDefault());
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
        }
    }
}
