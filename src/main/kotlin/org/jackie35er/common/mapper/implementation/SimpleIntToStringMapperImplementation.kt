package org.jackie35er.common.mapper.implementation

import org.jackie35er.common.mapper.IntToStringMapper

object SimpleIntToStringMapperImplementation : IntToStringMapper {

    override fun mapIntToString(int: Int): String {
        return int.toString()
    }
}