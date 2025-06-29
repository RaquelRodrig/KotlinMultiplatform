/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.MainImage

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param name 
 * @param currentBid 
 * @param endDate 
 * @param reservePriceStatus 
 * @param municipalityName 
 * @param make 
 * @param description 
 * @param mainImage 
 * @param categoryLevel1 
 * @param categoryLevel2 
 * @param categoryLevel3 
 */
@Serializable@Serializable

data class Product (

    @SerialName(value = "id") @Required val id: kotlin.Int,

    @SerialName(value = "name") @Required val name: kotlin.String,

    @SerialName(value = "currentBid") @Required val currentBid: kotlin.Int,

    @SerialName(value = "endDate") @Required val endDate: kotlinx.datetime.Instant,

    @SerialName(value = "reservePriceStatus") @Required val reservePriceStatus: kotlin.String,

    @SerialName(value = "municipalityName") @Required val municipalityName: kotlin.String,

    @SerialName(value = "make") val make: kotlin.String? = null,

    @SerialName(value = "description") val description: kotlin.String? = null,

    @SerialName(value = "mainImage") val mainImage: MainImage? = null,

    @SerialName(value = "categoryLevel1") val categoryLevel1: kotlin.Int? = null,

    @SerialName(value = "categoryLevel2") val categoryLevel2: kotlin.Int? = null,

    @SerialName(value = "categoryLevel3") val categoryLevel3: kotlin.Int? = null

) {


}

