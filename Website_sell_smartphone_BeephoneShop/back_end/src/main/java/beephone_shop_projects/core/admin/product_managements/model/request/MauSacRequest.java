package beephone_shop_projects.core.admin.product_managements.model.request;

import beephone_shop_projects.infrastructure.constant.StatusCommon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MauSacRequest {

    private String id;

    private String ma;

    private String tenMauSac;

    private StatusCommon status;

}
