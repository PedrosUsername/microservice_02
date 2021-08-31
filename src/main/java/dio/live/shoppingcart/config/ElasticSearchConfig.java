package dio.live.shoppingcart.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.dio.live.shoppingcart")
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

    // imported from
    // https://docs.spring.io/spring-data/elasticsearch/docs/4.2.4/reference/html/#repositories.create-instances
    @Override
    @Bean
    public RestHighLevelClient elasticsearchClient() {

        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("localhost:9300")
                .build();

        return RestClients.create(clientConfiguration).rest();
    }



}
