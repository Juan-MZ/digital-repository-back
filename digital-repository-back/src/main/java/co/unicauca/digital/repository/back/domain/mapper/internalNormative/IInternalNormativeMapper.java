package co.unicauca.digital.repository.back.domain.mapper.internalNormative;

import co.unicauca.digital.repository.back.domain.dto.internalNormative.request.InternalNormativeDtoCreateRequest;
import co.unicauca.digital.repository.back.domain.dto.internalNormative.response.InternalNormativeDtoCreateResponse;
import co.unicauca.digital.repository.back.domain.dto.internalNormative.response.InternalNormativeDtoFindResponse;
import co.unicauca.digital.repository.back.domain.model.internalNormative.InternalNormative;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IInternalNormativeMapper {

        @Mappings({
                        @Mapping(target = "name", source = "name"),
                        @Mapping(target = "isInForce", source = "isInForce"),
                        @Mapping(target = "initialTime", source = "initialTime"),
                        @Mapping(target = "finalTime", source = "finalTime"),
                        @Mapping(target = "createUser", source = "createUser"),
                        @Mapping(target = "createTime", source = "createTime")
        })
        InternalNormativeDtoCreateResponse toDtoCreate(final InternalNormative internalNormative);

        @Mappings({
                        @Mapping(target = "id", source = "id"),
                        @Mapping(target = "name", source = "name"),
                        @Mapping(target = "isInForce", source = "isInForce"),
                        @Mapping(target = "initialTime", source = "initialTime"),
                        @Mapping(target = "finalTime", source = "finalTime")
        })
        InternalNormativeDtoFindResponse toDtoFind(final InternalNormative internalNormative);

        @Mappings({
                        @Mapping(target = "name", source = "name"),
                        @Mapping(target = "isInForce", source = "isInForce"),
                        @Mapping(target = "initialTime", source = "initialTime"),
                        @Mapping(target = "finalTime", source = "finalTime")
        })
        InternalNormative toEntityCreate(final InternalNormativeDtoCreateRequest internalNormativeDtoCreateRequest);
}
