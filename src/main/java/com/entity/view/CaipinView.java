package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.CaipinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 菜品
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("caipin")
public class CaipinView extends CaipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 菜品类型的值
	*/
	@ColumnInfo(comment="菜品类型的字典表值",type="varchar(200)")
	private String caipinValue;
	/**
	* 是否上架的值
	*/
	@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
	private String shangxiaValue;

	//级联表 商家
		/**
		* 商家名称
		*/

		@ColumnInfo(comment="商家名称",type="varchar(200)")
		private String shangjiaName;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String shangjiaPhone;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String shangjiaEmail;
		/**
		* 营业执照展示
		*/

		@ColumnInfo(comment="营业执照展示",type="varchar(200)")
		private String shangjiaPhoto;
		/**
		* 工作时间
		*/

		@ColumnInfo(comment="工作时间",type="varchar(200)")
		private String shangjiaGongzuoshijian;
		/**
		* 配送范围
		*/

		@ColumnInfo(comment="配送范围",type="varchar(200)")
		private String shangjiaPeisongfanwei;
		/**
		* 主营项目
		*/

		@ColumnInfo(comment="主营项目",type="varchar(200)")
		private String shangjiaZhuying;
		/**
		* 店铺位置
		*/

		@ColumnInfo(comment="店铺位置",type="varchar(200)")
		private String shangjiaAdress;
		/**
		* 信用等级
		*/
		@ColumnInfo(comment="信用等级",type="int(11)")
		private Integer shangjiaXingjiTypes;
			/**
			* 信用等级的值
			*/
			@ColumnInfo(comment="信用等级的字典表值",type="varchar(200)")
			private String shangjiaXingjiValue;
		/**
		* 现有余额
		*/
		@ColumnInfo(comment="现有余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 商家介绍
		*/

		@ColumnInfo(comment="商家介绍",type="longtext")
		private String shangjiaContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer shangjiaDelete;



	public CaipinView() {

	}

	public CaipinView(CaipinEntity caipinEntity) {
		try {
			BeanUtils.copyProperties(this, caipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 菜品类型的值
	*/
	public String getCaipinValue() {
		return caipinValue;
	}
	/**
	* 设置： 菜品类型的值
	*/
	public void setCaipinValue(String caipinValue) {
		this.caipinValue = caipinValue;
	}
	//当前表的
	/**
	* 获取： 是否上架的值
	*/
	public String getShangxiaValue() {
		return shangxiaValue;
	}
	/**
	* 设置： 是否上架的值
	*/
	public void setShangxiaValue(String shangxiaValue) {
		this.shangxiaValue = shangxiaValue;
	}


	//级联表的get和set 商家

		/**
		* 获取： 商家名称
		*/
		public String getShangjiaName() {
			return shangjiaName;
		}
		/**
		* 设置： 商家名称
		*/
		public void setShangjiaName(String shangjiaName) {
			this.shangjiaName = shangjiaName;
		}

		/**
		* 获取： 联系方式
		*/
		public String getShangjiaPhone() {
			return shangjiaPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setShangjiaPhone(String shangjiaPhone) {
			this.shangjiaPhone = shangjiaPhone;
		}

		/**
		* 获取： 邮箱
		*/
		public String getShangjiaEmail() {
			return shangjiaEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setShangjiaEmail(String shangjiaEmail) {
			this.shangjiaEmail = shangjiaEmail;
		}

		/**
		* 获取： 营业执照展示
		*/
		public String getShangjiaPhoto() {
			return shangjiaPhoto;
		}
		/**
		* 设置： 营业执照展示
		*/
		public void setShangjiaPhoto(String shangjiaPhoto) {
			this.shangjiaPhoto = shangjiaPhoto;
		}

		/**
		* 获取： 工作时间
		*/
		public String getShangjiaGongzuoshijian() {
			return shangjiaGongzuoshijian;
		}
		/**
		* 设置： 工作时间
		*/
		public void setShangjiaGongzuoshijian(String shangjiaGongzuoshijian) {
			this.shangjiaGongzuoshijian = shangjiaGongzuoshijian;
		}

		/**
		* 获取： 配送范围
		*/
		public String getShangjiaPeisongfanwei() {
			return shangjiaPeisongfanwei;
		}
		/**
		* 设置： 配送范围
		*/
		public void setShangjiaPeisongfanwei(String shangjiaPeisongfanwei) {
			this.shangjiaPeisongfanwei = shangjiaPeisongfanwei;
		}

		/**
		* 获取： 主营项目
		*/
		public String getShangjiaZhuying() {
			return shangjiaZhuying;
		}
		/**
		* 设置： 主营项目
		*/
		public void setShangjiaZhuying(String shangjiaZhuying) {
			this.shangjiaZhuying = shangjiaZhuying;
		}

		/**
		* 获取： 店铺位置
		*/
		public String getShangjiaAdress() {
			return shangjiaAdress;
		}
		/**
		* 设置： 店铺位置
		*/
		public void setShangjiaAdress(String shangjiaAdress) {
			this.shangjiaAdress = shangjiaAdress;
		}
		/**
		* 获取： 信用等级
		*/
		public Integer getShangjiaXingjiTypes() {
			return shangjiaXingjiTypes;
		}
		/**
		* 设置： 信用等级
		*/
		public void setShangjiaXingjiTypes(Integer shangjiaXingjiTypes) {
			this.shangjiaXingjiTypes = shangjiaXingjiTypes;
		}


			/**
			* 获取： 信用等级的值
			*/
			public String getShangjiaXingjiValue() {
				return shangjiaXingjiValue;
			}
			/**
			* 设置： 信用等级的值
			*/
			public void setShangjiaXingjiValue(String shangjiaXingjiValue) {
				this.shangjiaXingjiValue = shangjiaXingjiValue;
			}

		/**
		* 获取： 现有余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 现有余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 商家介绍
		*/
		public String getShangjiaContent() {
			return shangjiaContent;
		}
		/**
		* 设置： 商家介绍
		*/
		public void setShangjiaContent(String shangjiaContent) {
			this.shangjiaContent = shangjiaContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getShangjiaDelete() {
			return shangjiaDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setShangjiaDelete(Integer shangjiaDelete) {
			this.shangjiaDelete = shangjiaDelete;
		}


	@Override
	public String toString() {
		return "CaipinView{" +
			", caipinValue=" + caipinValue +
			", shangxiaValue=" + shangxiaValue +
			", shangjiaName=" + shangjiaName +
			", shangjiaPhone=" + shangjiaPhone +
			", shangjiaEmail=" + shangjiaEmail +
			", shangjiaPhoto=" + shangjiaPhoto +
			", shangjiaGongzuoshijian=" + shangjiaGongzuoshijian +
			", shangjiaPeisongfanwei=" + shangjiaPeisongfanwei +
			", shangjiaZhuying=" + shangjiaZhuying +
			", shangjiaAdress=" + shangjiaAdress +
			", newMoney=" + newMoney +
			", shangjiaContent=" + shangjiaContent +
			", shangjiaDelete=" + shangjiaDelete +
			"} " + super.toString();
	}
}
