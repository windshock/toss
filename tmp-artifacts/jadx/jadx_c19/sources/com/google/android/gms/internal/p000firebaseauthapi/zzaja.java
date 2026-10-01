package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.firebase-auth-api.zzaja.zzb;
import com.google.android.gms.internal.p000firebaseauthapi.zzaja;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzaja<MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzahd<MessageType, BuilderType> {
    private static Map<Object, zzaja<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzame zzb = zzame.zzc();

    protected static final class zza<T extends zzaja<T, ?>> extends zzahh<T> {
        private final T zza;

        public zza(T t) {
            this.zza = t;
        }
    }

    static final class zzc implements zzaiu<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaiu
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaiu
        public final zzakn zza(zzakn zzaknVar, zzakk zzakkVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaiu
        public final zzakt zza(zzakt zzaktVar, zzakt zzaktVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaiu
        public final zzamo zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaiu
        public final zzamy zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaiu
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaiu
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzaja<MessageType, BuilderType> implements zzakm {
        protected zzais<zzc> zzc = zzais.zzb();

        final zzais<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzais) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static final class zzf<ContainingType extends zzakk, Type> extends zzaim<ContainingType, Type> {
    }

    private final int zza() {
        return zzaky.zza().zza((zzaky) this).zzb(this);
    }

    protected abstract Object zza(int i2, Object obj, Object obj2);

    public static class zzb<MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzahf<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahf
        /* renamed from: zzc */
        public final /* synthetic */ zzahf clone() {
            return (zzb) clone();
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzv()) {
                zzi();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakn
        /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public final MessageType zzf() {
            MessageType messagetype = (MessageType) zzg();
            if (messagetype.zzu()) {
                return messagetype;
            }
            throw new zzamc(messagetype);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakn
        /* renamed from: zze, reason: merged with bridge method [inline-methods] */
        public MessageType zzg() {
            if (!this.zza.zzv()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakm
        public final /* synthetic */ zzakk zzr() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahf
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzg();
            return zzbVar;
        }

        protected zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzv()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzn();
        }

        protected final void zzh() {
            if (this.zza.zzv()) {
                return;
            }
            zzi();
        }

        protected void zzi() {
            MessageType messagetype = (MessageType) this.zzb.zzn();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzaky.zza().zza((zzaky) messagetype).zza(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakm
        public final boolean zzu() {
            return zzaja.zza(this.zza, false);
        }
    }

    private final int zzb(zzalc<?> zzalcVar) {
        if (zzalcVar == null) {
            return zzaky.zza().zza((zzaky) this).zza(this);
        }
        return zzalcVar.zza(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahd
    final int zzh() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakk
    public final int zzk() {
        return zza((zzalc) null);
    }

    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahd
    final int zza(zzalc zzalcVar) {
        if (zzv()) {
            int iZzb = zzb((zzalc<?>) zzalcVar);
            if (iZzb >= 0) {
                return iZzb;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZzb);
        }
        if (zzh() != Integer.MAX_VALUE) {
            return zzh();
        }
        int iZzb2 = zzb((zzalc<?>) zzalcVar);
        zzb(iZzb2);
        return iZzb2;
    }

    public int hashCode() {
        if (zzv()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    protected final <MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzl() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzm() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    private static <T extends zzaja<T, ?>> T zza(T t) throws zzajj {
        if (t == null || t.zzu()) {
            return t;
        }
        throw new zzamc(t).zza().zza(t);
    }

    static <T extends zzaja<?, ?>> T zza(Class<T> cls) throws ClassNotFoundException {
        T t = (T) zzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((zzaja) zzamh.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
        if (t2 == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, t2);
        return t2;
    }

    final MessageType zzn() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    protected static <T extends zzaja<T, ?>> T zza(T t, zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (T) zza(zzb(t, zzahmVar, zzaipVar));
    }

    protected static <T extends zzaja<T, ?>> T zza(T t, InputStream inputStream, zzaip zzaipVar) throws zzajj {
        zzaib zzaicVar;
        if (inputStream == null) {
            byte[] bArr = zzajc.zzb;
            zzaicVar = zzaib.zza(bArr, 0, bArr.length, false);
        } else {
            zzaicVar = new zzaic(inputStream);
        }
        return (T) zza(zza(t, zzaicVar, zzaipVar));
    }

    protected static <T extends zzaja<T, ?>> T zza(T t, byte[] bArr, zzaip zzaipVar) throws zzajj {
        return (T) zza(zza(t, bArr, 0, bArr.length, zzaipVar));
    }

    private static <T extends zzaja<T, ?>> T zzb(T t, zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        zzaib zzaibVarZzc = zzahmVar.zzc();
        T t2 = (T) zza(t, zzaibVarZzc, zzaipVar);
        try {
            zzaibVarZzc.zzb(0);
            return t2;
        } catch (zzajj e) {
            throw e.zza(t2);
        }
    }

    private static <T extends zzaja<T, ?>> T zza(T t, zzaib zzaibVar, zzaip zzaipVar) throws zzajj {
        T t2 = (T) t.zzn();
        try {
            zzalc zzalcVarZza = zzaky.zza().zza((zzaky) t2);
            zzalcVarZza.zza(t2, zzaig.zza(zzaibVar), zzaipVar);
            zzalcVarZza.zzc(t2);
            return t2;
        } catch (zzajj e) {
            e = e;
            if (e.zzk()) {
                e = new zzajj(e);
            }
            throw e.zza(t2);
        } catch (zzamc e2) {
            throw e2.zza().zza(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzajj) {
                throw ((zzajj) e3.getCause());
            }
            throw new zzajj(e3).zza(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzajj) {
                throw ((zzajj) e4.getCause());
            }
            throw e4;
        }
    }

    private static <T extends zzaja<T, ?>> T zza(T t, byte[] bArr, int i2, int i3, zzaip zzaipVar) throws zzajj {
        T t2 = (T) t.zzn();
        try {
            zzalc zzalcVarZza = zzaky.zza().zza((zzaky) t2);
            zzalcVarZza.zza(t2, bArr, 0, i3, new zzahl(zzaipVar));
            zzalcVarZza.zzc(t2);
            return t2;
        } catch (zzajj e) {
            e = e;
            if (e.zzk()) {
                e = new zzajj(e);
            }
            throw e.zza(t2);
        } catch (zzamc e2) {
            throw e2.zza().zza(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzajj) {
                throw ((zzajj) e3.getCause());
            }
            throw new zzajj(e3).zza(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzajj.zzi().zza(t2);
        }
    }

    protected static <E> zzajg<E> zzo() {
        return zzalb.zzd();
    }

    protected static <E> zzajg<E> zza(zzajg<E> zzajgVar) {
        int size = zzajgVar.size();
        return zzajgVar.zza(size == 0 ? 10 : size << 1);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakk
    public final /* synthetic */ zzakn zzp() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakk
    public final /* synthetic */ zzakn zzq() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakm
    public final /* synthetic */ zzakk zzr() {
        return (zzaja) zza(zze.zzf, (Object) null, (Object) null);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zza(zzakk zzakkVar, String str, Object[] objArr) {
        return new zzala(zzakkVar, str, objArr);
    }

    public String toString() {
        return zzakp.zza(this, super.toString());
    }

    protected final void zzs() {
        zzaky.zza().zza((zzaky) this).zzc(this);
        zzt();
    }

    final void zzt() {
        this.zzd &= Integer.MAX_VALUE;
    }

    protected static <T extends zzaja<?, ?>> void zza(Class<T> cls, T t) {
        t.zzt();
        zzc.put(cls, t);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzahd
    final void zzb(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + i2);
        }
        this.zzd = (i2 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakk
    public final void zza(zzaii zzaiiVar) throws IOException {
        zzaky.zza().zza((zzaky) this).zza((zzalc) this, (zzanb) zzaik.zza(zzaiiVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzaky.zza().zza((zzaky) this).zzb(this, (zzaja) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakm
    public final boolean zzu() {
        return zza(this, true);
    }

    protected static final <T extends zzaja<T, ?>> boolean zza(T t, boolean z) {
        byte bByteValue = ((Byte) t.zza(zze.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzd = zzaky.zza().zza((zzaky) t).zzd(t);
        if (z) {
            t.zza(zze.zzb, zZzd ? t : null, null);
        }
        return zZzd;
    }

    final boolean zzv() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
