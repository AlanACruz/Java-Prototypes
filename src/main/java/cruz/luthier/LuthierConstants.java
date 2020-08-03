package cruz.luthier;

import java.math.BigDecimal;

/**
 * @author CruzA
 */
public class LuthierConstants
{
	public static BigDecimal R        = findR();
	public static BigDecimal R_APPROX = new BigDecimal("1.0595");
	public static BigDecimal R_EXACT  = new BigDecimal(
			"1.05946309435929526456182529494634170077920431749418562855920843145876164606325572238376837686394556900774076432638281736624173752082785103964472398511427111543299047023971493380416542568764209763293798959471297099470648009389911738476867055206894003267815751383303231319955390959014587484595500681806521772802362810455571386955320175480264005717959587958453756782983002097737925005368744033988819376063234352543990063288308461255294808887214823304414074184893108198509249979986687035709497917584337029863023761262517398191900891936693129805453519798270535877356578604822646044730909686243725962722936825280448635707001711317999310498367320889886403556920267157664120910549625751449398108864973818515174409202517798878483166689233292820193974364207898233882260007055787901039646968870449377015559931493798661533522571523746140514347159095506342399653920121443555462612297570882130516983593531956991704475970684316245269353078720172787590226711143231291020511009984331851568562781390012191374399990910181352025429250754402336285439382439722216215007269019042914439238960179329680612521871979736276453068441876778545886268025282375471228788118585803914277880007129015649572271191427096266663894279352112850738128894357337542429105723162584096234129773088118460647946534351508336021288239842387584790435514093812664292413326851693982702669340220028372903416624265952097664896689826837687703513408426346233578630694607266918802706084606886946367231230157382657033912771057402113688599721601506584968539966554075996557955268230087225267789163025433566576872420400131071658416829193510963939436335907409930004898752345623642583574902338286140859918209964818239757382879441356352636387988912482515880006851368353331934734266064986065309950454261552645272041404557069141462782679552437323710408085157281045401156091030844759475904195341544170644967039733209801562835770608757730923135789225559531738138718479286421192239500795950538930265249685292276498806422255813472047131962981621125765241826428136406981505402195185938582140995327398704447575475880280630971950473174297930599081026903020163717184853187065057462365408887644826332713691800947455508268342664596861593355306005842022505892151314423683374641288588958996270437132156241044835327337811702353194020002632166657243707493605945371020122694848365665757270207419920782787277336396222420807151977721289407617674310975635158226659570199827873619516380209030999313673751715647008718162159095440547668559673314196038705555279168321964582330550546278513058287021319069324233016839123416267379217152793964848747535859561999105618938054209375210736301506431127734479687041606084036909305119285737592785611226989365508852084390673320592696082956662468776491503388578547953862070343818700026520591104730390326503773394502659779741248910452397187017520337274514549255529421068385788514722929524025158773037491425932696358046599360990039239294037761995969339565595761318440794301174128983070624891007602807121099542393047618475116563237824921591820290745415347745872509576206911552095534397615330432406883772391975362727163210726789746881707344534126880801586001805340302591756692292190388221938187794688658791093933170453784122450029732543752323539619386361351491442889704116803768499088767140026655083164415736184670654647315849828314946502235010531677354686829506077099953221057344383648330466045372351355548132828192571088087974570238415950184300922371801697438191432776016126025832171949386257212395373146829563472148812464492878362857835334993207321953377832465725899610857605111779504415332185912555425883645580163010188196178158983061749198069324315676340092498065049574646914854365499006563085873506"
	);

	/**
	 * r is the ratio between half steps in twelve-tone equal temperament
	 *
	 * @implSpec r = 2^(1/12)
	 *
	 * @return 2^(1/12)
	 */
	private static BigDecimal findR()
	{
		BigDecimal twelve = BigDecimal.valueOf(12d);
		BigDecimal two    = BigDecimal.valueOf(2d);

		return NthRootSolver.nthRoot(twelve.intValue(), two);
	}

	BigDecimal twelveHundred = new BigDecimal("1200");

	BigDecimal cent = BigDecimal.ONE.divide(twelveHundred);

	/**
	 * Formula 2: the length of the string when it is fretted at the k-th fret is
	 * L-sub(k) ignore v by making it 2 because velocity is applied by human hands
	 * and is relatively constant
	 *
	 * @implSpec f-sub(k) = v / (2 * L-sub(k))
	 */

	/**
	 * Formula 1 & 2 Combined: v / (2 * L-sub(k)) = v / (2 * L-sub(k))
	 *
	 * @implNote v / (2 * L-sub(1)) = r * v / (2 * L-sub(0))
	 * @implNote 2 * L-sub(1) = r * (2 * L-sub(0)
	 * @implNote 1 / L-sub(1) = r * (1 / L-sub(0))
	 * @implNote L-sub(1) = (1/r) * L-sub(0)
	 *
	 * @implSpec L-sub(k) = (1/r)^(k) * L-sub(0)
	 */

}
