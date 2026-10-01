package o;

import java.util.Iterator;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class buildXmlFromJsonArray<T> extends JsonReaderUnknownNumberParsing<T> {
    final Iterable<? extends T> onNavigationEvent;

    public buildXmlFromJsonArray(Iterable<? extends T> iterable) {
        this.onNavigationEvent = iterable;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        try {
            onWarmupCompleted(ycxexternalsyntheticlambda0, this.onNavigationEvent.iterator());
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            access25900.error(th, ycxexternalsyntheticlambda0);
        }
    }

    public static <T> void onWarmupCompleted(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                access25900.complete(ycxexternalsyntheticlambda0);
            } else if (ycxexternalsyntheticlambda0 instanceof deserializeShortCollection) {
                ycxexternalsyntheticlambda0.onExtraCallback(new onExtraCallbackWithResult((deserializeShortCollection) ycxexternalsyntheticlambda0, it));
            } else {
                ycxexternalsyntheticlambda0.onExtraCallback(new IAuthTabCallback(ycxexternalsyntheticlambda0, it));
            }
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            access25900.error(th, ycxexternalsyntheticlambda0);
        }
    }

    static abstract class onWarmupCompleted<T> extends clearName<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> it;
        boolean once;

        abstract void onExtraCallback();

        abstract void onWarmupCompleted(long j);

        @Override // o.parseFloatGeneric
        public final int requestFusion(int i) {
            return i & 1;
        }

        onWarmupCompleted(Iterator<? extends T> it) {
            this.it = it;
        }

        @Override // o.parsePositiveDecimal
        public final T poll() {
            Iterator<? extends T> it = this.it;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) floatExponent.onExtraCallbackWithResult((Object) this.it.next(), "Iterator.next() returned a null value");
        }

        @Override // o.parsePositiveDecimal
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.it;
            return it == null || !it.hasNext();
        }

        @Override // o.parsePositiveDecimal
        public final void clear() {
            this.it = null;
        }

        @Override // o.ycxExternalSyntheticLambda1
        public final void request(long j) {
            if (setLogs.validate(j) && TombstoneProtosLogBufferBuilder.onWarmupCompleted(this, j) == 0) {
                if (j == LongCompanionObject.MAX_VALUE) {
                    onExtraCallback();
                } else {
                    onWarmupCompleted(j);
                }
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public final void cancel() {
            this.cancelled = true;
        }
    }

    static final class IAuthTabCallback<T> extends onWarmupCompleted<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final ycxExternalSyntheticLambda0<? super T> downstream;

        IAuthTabCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, Iterator<? extends T> it) {
            super(it);
            this.downstream = ycxexternalsyntheticlambda0;
        }

        @Override // o.buildXmlFromJsonArray.onWarmupCompleted
        void onExtraCallback() {
            Iterator<? extends T> it = this.it;
            ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        ycxexternalsyntheticlambda0.onWarmupCompleted((Throwable) new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                            return;
                        }
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                        return;
                    }
                } catch (Throwable th2) {
                    NumberConverter.onWarmupCompleted(th2);
                    ycxexternalsyntheticlambda0.onWarmupCompleted(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // o.buildXmlFromJsonArray.onWarmupCompleted
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void onWarmupCompleted(long j) {
            Iterator<? extends T> it = this.it;
            ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (next == null) {
                                ycxexternalsyntheticlambda0.onWarmupCompleted((Throwable) new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                NumberConverter.onWarmupCompleted(th);
                                ycxexternalsyntheticlambda0.onWarmupCompleted(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            NumberConverter.onWarmupCompleted(th2);
                            ycxexternalsyntheticlambda0.onWarmupCompleted(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    static final class onExtraCallbackWithResult<T> extends onWarmupCompleted<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final deserializeShortCollection<? super T> downstream;

        onExtraCallbackWithResult(deserializeShortCollection<? super T> deserializeshortcollection, Iterator<? extends T> it) {
            super(it);
            this.downstream = deserializeshortcollection;
        }

        @Override // o.buildXmlFromJsonArray.onWarmupCompleted
        void onExtraCallback() {
            Iterator<? extends T> it = this.it;
            deserializeShortCollection<? super T> deserializeshortcollection = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        deserializeshortcollection.onWarmupCompleted((Throwable) new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    deserializeshortcollection.onExtraCallback((deserializeShortCollection<? super T>) next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            deserializeshortcollection.onExtraCallbackWithResult();
                            return;
                        }
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        deserializeshortcollection.onWarmupCompleted(th);
                        return;
                    }
                } catch (Throwable th2) {
                    NumberConverter.onWarmupCompleted(th2);
                    deserializeshortcollection.onWarmupCompleted(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // o.buildXmlFromJsonArray.onWarmupCompleted
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void onWarmupCompleted(long j) {
            Iterator<? extends T> it = this.it;
            deserializeShortCollection<? super T> deserializeshortcollection = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (next == null) {
                                deserializeshortcollection.onWarmupCompleted((Throwable) new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zOnExtraCallback = deserializeshortcollection.onExtraCallback((deserializeShortCollection<? super T>) next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    deserializeshortcollection.onExtraCallbackWithResult();
                                    return;
                                } else if (zOnExtraCallback) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                NumberConverter.onWarmupCompleted(th);
                                deserializeshortcollection.onWarmupCompleted(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            NumberConverter.onWarmupCompleted(th2);
                            deserializeshortcollection.onWarmupCompleted(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    }
                }
            } while (j != 0);
        }
    }
}
