package com.almod.config;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class ClientConfigHazelcast {
    @Getter
    private final HazelcastInstance hazelcastInstance;

    private final String cacheMap = "CACHE_MAP";

    public ClientConfigHazelcast() {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setClusterName("MultifunctionalProject");
        clientConfig.getNetworkConfig().setSmartRouting(false); // Клиент установит только начальное соединение (В логах не будет спамма клиент стаститики)

        hazelcastInstance = HazelcastClient.newHazelcastClient(clientConfig);
    }

    public IMap<Object, Object> getCacheMap() {
        return hazelcastInstance.getMap(cacheMap);
    }
}
