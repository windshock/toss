package com.initech.cryptox;

import com.initech.provider.crypto.InitechProvider;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class KeyGenerator {
    private String algorithm;
    private boolean isInit = false;
    private KeyGeneratorSpi keyGeneratorSpi;
    private Provider provider;

    protected KeyGenerator(KeyGeneratorSpi keyGeneratorSpi, Provider provider, String str) {
        this.keyGeneratorSpi = keyGeneratorSpi;
        this.provider = provider;
        this.algorithm = str;
    }

    public static final KeyGenerator getInstance(String str) throws NoSuchAlgorithmException {
        Provider[] providers = Security.getProviders();
        for (int i = 0; i < providers.length; i++) {
            try {
                return new KeyGenerator((KeyGeneratorSpi) InitechProvider.getImplementation(str, "KeyGenerator", providers[i]), providers[i], str);
            } catch (Exception unused) {
            }
        }
        throw new NoSuchAlgorithmException("No Such KeyGenerator algorithm");
    }

    public static final KeyGenerator getInstance(String str, String str2) throws NoSuchAlgorithmException, NoSuchProviderException {
        Provider providerCheckProviderObject = InitechProvider.checkProviderObject(str2);
        if (providerCheckProviderObject == null) {
            throw new NoSuchProviderException("No Such Provider");
        }
        try {
            return new KeyGenerator((KeyGeneratorSpi) InitechProvider.getImplementation(str, "KeyGenerator", providerCheckProviderObject), providerCheckProviderObject, str);
        } catch (Exception unused) {
            throw new NoSuchAlgorithmException("No Such KeyGenerotar algorithm");
        }
    }

    public final Provider getProvider() {
        return this.provider;
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final void init(SecureRandom secureRandom) {
        this.keyGeneratorSpi.engineInit(secureRandom);
        this.isInit = true;
    }

    public final void init(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        this.keyGeneratorSpi.engineInit(algorithmParameterSpec, new SecureRandom());
        this.isInit = true;
    }

    public final void init(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        this.keyGeneratorSpi.engineInit(algorithmParameterSpec, secureRandom);
        this.isInit = true;
    }

    public final void init(int i) {
        this.keyGeneratorSpi.engineInit(i, new SecureRandom());
        this.isInit = true;
    }

    public final void init(int i, SecureRandom secureRandom) {
        this.keyGeneratorSpi.engineInit(i, secureRandom);
        this.isInit = true;
    }

    public final SecretKey generateKey() {
        return this.keyGeneratorSpi.engineGenerateKey();
    }
}
