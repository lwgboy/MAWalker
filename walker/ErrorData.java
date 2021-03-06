package walker;

/**
 * 处理内部错误，在execute时，如果是run所捕获的错误，则放入此类中。 这样，当execute捕获到错误时，首先检查此类中有无存放错误信息，
 * 如果有，则转入错误信息处理； 如果没有，则说明是其他位置的异常，另行处理。
 */
public class ErrorData {

	public enum DataType {
		bytes, text, none
	}

	public static DataType currentDataType = DataType.none;
	public static ErrorType currentErrorType = ErrorType.none;
	public static byte[] bytes;
	public static String text;

	public enum ErrorType {
		// 总体
		none, ConnectionError,
		// 登录
		LoginDataError, LoginDataParseError, LoginResponse,
		// 获取地图
		AreaDataError, AreaDataParseError, AreaResponse,
		// 上街
		GotoFloorDataError, GotoFloorDataParseError, GotoFloorResponse,
		// 获取妖精列表
		FairyListDataError, FairyListDataParseError, FairyListResponse,
		// 妖精战斗
		PrivateFairyBattleDataError, PrivateFairyBattleDataParseError, PrivateFairyBattleResponse,
		// 探索
		ExploreDataError, ExploreDataParseError, ExploreResponse,
		// 外敌界面
		GuildTopDataError, GuildTopDataParseError, GuildTopResponse,
		// 外敌战
		GuildBattleDataError, GuildBattleDataParseError, GuildBattleResponse,
		// 获取妖精战礼物
		GetFairyRewardDataError, GetFairyRewardResponse,
		// 卖卡
		SellCardDataError, SellCardResponse,
		// 升级
		LvUpDataError, LvUpResponse,
		// 点赞
		FairyDianzanDataError, FairyDianzanDataParseError, FairyDianzanResponse,
		// 妖精战历史信息
		FairyHistoryDataError, FairyHistoryDataParseError, FairyHistoryResponse,
		// 收点赞
		RecFairyDianzanDataError, RecFairyDianzanDataParseError, RecFairyDianzanResponse,
		// 吃药
		AutoMedicineDataError, AutoMedicineResponse,
		// cookie
		CookieOutOfDate, CookieLoginDataError, CookieLoginDataParseError, CookieLoginResponse,
		// 主城界面
		MainMenuDataError, GotoMainMenuDataParseError,
		// 获取卡组信息
		GetCardDeckDataError, GetCardDeckDataParseError, GetCardDeckResponse,
		// 更换卡组
		ChangeCardDeckDataError, ChangeCardDeckDataParseError, ChangeCardDeckResponse,
		//盒子界面
		RewardBoxDataError, RewardBoxDataParseError, RewardBoxResponse,
		//开盒子
		GetRewardsDataError, GetRewardsDataParseError, GetRewardsResponse
	}

	public static void clear() {
		bytes = null;
		text = null;
		currentDataType = DataType.none;
		currentErrorType = ErrorType.none;
	}
}
