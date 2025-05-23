package beephone_shop_projects.core.admin.order_management.model.request;

import beephone_shop_projects.infrastructure.constant.OrderStatus;
import beephone_shop_projects.infrastructure.constant.OrderType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderRequest {

  private String id;

  private String ma;

  private BigDecimal tongTien;

  private BigDecimal tienThua;

  private BigDecimal tongTienSauKhiGiam;

  private BigDecimal tienKhachTra;

  private BigDecimal tienTraKhach;

  private BigDecimal khachCanTra;

  private OrderType loaiHoaDon;

  private BigDecimal tienTraHang;

  private OrderStatus trangThai;

  private String ghiChu;

  private String hoVaTen;

  private String soDienThoai;

  private String email;

  private BigDecimal phiShip;

  private String tenNguoiNhan;

  private String soDienThoaiNguoiNhan;

  private String diaChiNguoiNhan;

  private String tinhThanhPhoNguoiNhan;

  private String quanHuyenNguoiNhan;

  private String xaPhuongNguoiNhan;

  private Date createdAt;

  private Date updatedAt;
//
  private String createdBy;
//
  private String updatedBy;

  private AccountRequest account;

  private AccountRequest employee;

  private CartRequest cart;

//  private Set<PaymentMethodResponse> paymentMethods;

//  private Set<OrderItemRequest> orderItems;

  private VoucherRequest voucher;

  private OrderHistoryRequest orderHistory;

  private List<OrderHistoryRequest> orderHistories;

  private Boolean isPayment;

  private Boolean isUpdateAccount;

  private Boolean isUpdateVoucher;

  private Boolean isUpdateInfoShip;

  private Boolean isUpdateInfoShipByCustomer;

  private Boolean isUpdateNameShip;

  private Boolean isUpdatePhoneShip;

  private Boolean isUpdateAddressShip;

  private Boolean isUpdateNoteShip;

  private Boolean isUpdateType;

  private String hinhThucThanhToan;

  private String hoanTien;

  private Boolean isUpdateFullName;

  private Boolean isUpdateEmail;

  private Boolean isUpdateSdt;

  private String createdByPayment;

  private String statusOrder;

  private String note;


}
