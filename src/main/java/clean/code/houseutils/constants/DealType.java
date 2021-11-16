package clean.code.houseutils.constants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum DealType {
    PURCHASE("매매"),
    RENT("임대차");

    public String description;
}
