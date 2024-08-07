package com.almod.store.repository.broker;

import com.almod.store.entity.ErrorDBEntity;
import com.almod.store.repository.AbstractRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorDBRepo extends AbstractRepo<ErrorDBEntity, Long> {
}
