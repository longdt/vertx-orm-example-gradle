package com.github.longdt.vertxorm.example.converter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.longdt.vertxorm.example.model.ArgumentDescription;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.Json;
import io.vertx.core.json.jackson.DatabindCodec;

import javax.persistence.AttributeConverter;
import java.util.Map;

/**
 * since arguments field has jsonb type so we can convert to/from {@link Buffer}
 */
public class ArgumentMapConverter implements AttributeConverter<Map<String, ArgumentDescription>, Buffer> {
    @Override
    public Buffer convertToDatabaseColumn(Map<String, ArgumentDescription> attribute) {
        return attribute != null ? Json.encodeToBuffer(attribute) : null;
    }

    @Override
    public Map<String, ArgumentDescription> convertToEntityAttribute(Buffer dbData) {
        return dbData != null ? ((DatabindCodec) Json.CODEC).fromBuffer(dbData, new TypeReference<>() {}) : null;
    }
}