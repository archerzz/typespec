// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package type.property.additionalproperties.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The WidgetData1 model.
 */
@Fluent
public final class WidgetData1 implements JsonSerializable<WidgetData1> {
    /*
     * The start property.
     */
    @Generated
    private final OffsetDateTime start;

    /*
     * The end property.
     */
    @Generated
    private OffsetDateTime end;

    /**
     * Creates an instance of WidgetData1 class.
     * 
     * @param start the start value to set.
     */
    @Generated
    public WidgetData1(OffsetDateTime start) {
        this.start = start;
    }

    /**
     * Get the start property: The start property.
     * 
     * @return the start value.
     */
    @Generated
    public OffsetDateTime getStart() {
        return this.start;
    }

    /**
     * Get the end property: The end property.
     * 
     * @return the end value.
     */
    @Generated
    public OffsetDateTime getEnd() {
        return this.end;
    }

    /**
     * Set the end property: The end property.
     * 
     * @param end the end value to set.
     * @return the WidgetData1 object itself.
     */
    @Generated
    public WidgetData1 setEnd(OffsetDateTime end) {
        this.end = end;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("start",
            this.start == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.start));
        jsonWriter.writeStringField("end",
            this.end == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.end));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WidgetData1 from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WidgetData1 if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WidgetData1.
     */
    @Generated
    public static WidgetData1 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OffsetDateTime start = null;
            OffsetDateTime end = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("start".equals(fieldName)) {
                    start = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("end".equals(fieldName)) {
                    end = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            WidgetData1 deserializedWidgetData1 = new WidgetData1(start);
            deserializedWidgetData1.end = end;

            return deserializedWidgetData1;
        });
    }
}
