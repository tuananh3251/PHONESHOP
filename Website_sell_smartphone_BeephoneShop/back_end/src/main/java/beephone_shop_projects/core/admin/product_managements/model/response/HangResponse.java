package beephone_shop_projects.core.admin.product_managements.model.response;

import beephone_shop_projects.infrastructure.constant.StatusCommon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HangResponse {

    private String id;

    private String ma;

    private String tenHang;

    private StatusCommon status;

}
