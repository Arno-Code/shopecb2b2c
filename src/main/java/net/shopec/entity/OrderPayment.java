package net.shopec.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Transient;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IEnum;

/**
 * Entity - 订单支付
 * 
 */
public class OrderPayment extends BaseEntity<OrderPayment> {

	private static final long serialVersionUID = -5052430116564638634L;

	/**
	 * 方式
	 */
	public enum Method implements IEnum {

		/**
		 * 在线支付
		 */
		online(0),

		/**
		 * 线下支付
		 */
		offline(1),

		/**
		 * 预存款支付
		 */
		deposit(2);

		private int value;

		Method(final int value) {
			this.value = value;
		}
		
		@Override
		public Serializable getValue() {
			return this.value;
		}
	}

	/**
	 * 编号
	 */
	private String sn;

	/**
	 * 方式
	 */
	private OrderPayment.Method method;

	/**
	 * 支付方式
	 */
	private String paymentMethod;

	/**
	 * 收款银行
	 */
	private String bank;

	/**
	 * 收款账号
	 */
	private String account;

	/**
	 * 付款金额
	 */
	private BigDecimal amount;

	/**
	 * 支付手续费
	 */
	private BigDecimal fee;

	/**
	 * 付款人
	 */
	private String payer;

	/**
	 * 备注
	 */
	private String memo;

	/**
	 * 订单
	 */
	@TableField(exist = false)
	private Order order;

	/**
	 * 获取编号
	 * 
	 * @return 编号
	 */
	public String getSn() {
		return sn;
	}

	/**
	 * 设置编号
	 * 
	 * @param sn
	 *            编号
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}

	/**
	 * 获取方式
	 * 
	 * @return 方式
	 */
	public OrderPayment.Method getMethod() {
		return method;
	}

	/**
	 * 设置方式
	 * 
	 * @param method
	 *            方式
	 */
	public void setMethod(OrderPayment.Method method) {
		this.method = method;
	}

	/**
	 * 获取支付方式
	 * 
	 * @return 支付方式
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * 设置支付方式
	 * 
	 * @param paymentMethod
	 *            支付方式
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * 获取收款银行
	 * 
	 * @return 收款银行
	 */
	public String getBank() {
		return bank;
	}

	/**
	 * 设置收款银行
	 * 
	 * @param bank
	 *            收款银行
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}

	/**
	 * 获取收款账号
	 * 
	 * @return 收款账号
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * 设置收款账号
	 * 
	 * @param account
	 *            收款账号
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * 获取付款金额
	 * 
	 * @return 付款金额
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * 设置付款金额
	 * 
	 * @param amount
	 *            付款金额
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * 获取支付手续费
	 * 
	 * @return 支付手续费
	 */
	public BigDecimal getFee() {
		return fee;
	}

	/**
	 * 设置支付手续费
	 * 
	 * @param fee
	 *            支付手续费
	 */
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	/**
	 * 获取付款人
	 * 
	 * @return 付款人
	 */
	public String getPayer() {
		return payer;
	}

	/**
	 * 设置付款人
	 * 
	 * @param payer
	 *            付款人
	 */
	public void setPayer(String payer) {
		this.payer = payer;
	}

	/**
	 * 获取备注
	 * 
	 * @return 备注
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * 设置备注
	 * 
	 * @param memo
	 *            备注
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * 获取订单
	 * 
	 * @return 订单
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * 设置订单
	 * 
	 * @param order
	 *            订单
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * 获取有效金额
	 * 
	 * @return 有效金额
	 */
	@Transient
	public BigDecimal getEffectiveAmount() {
		BigDecimal effectiveAmount = getAmount().subtract(getFee());
		return effectiveAmount.compareTo(BigDecimal.ZERO) >= 0 ? effectiveAmount : BigDecimal.ZERO;
	}

	/**
	 * 设置支付方式
	 * 
	 * @param paymentMethod
	 *            支付方式
	 */
	@Transient
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		setPaymentMethod(paymentMethod != null ? paymentMethod.getName() : null);
	}

}