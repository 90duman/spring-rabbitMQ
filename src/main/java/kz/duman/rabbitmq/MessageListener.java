package kz.duman.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void listener(MessageRequest message) {
        log.info("Received message: {}, id: {}, date: {}", message.getMessage(), message.getMessageId(), message.getMessageDate());
    }

}
