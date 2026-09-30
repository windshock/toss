package com.tnkfactory.ad.repository.db.dao;

import com.tnkfactory.ad.repository.db.entity.AdItemDto;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface AdItemDao {
    void delete(@NotNull AdItemDto adItemDto);

    void deleteAll();

    void deleteByUserId(long j);

    AdItemDto findByAppId(long j);

    List<AdItemDto> getAll();

    void insertAll(@NotNull AdItemDto... adItemDtoArr);

    List<AdItemDto> loadAllByFilter(int i2);

    void update(@NotNull AdItemDto adItemDto);
}
