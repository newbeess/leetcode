package me.newbeessfu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.openjdk.jol.vm.VM;

public class TTT {

  static long[] arr = new long[100];

  public static void main(String[] args) {
//    int[] arr = new int[]{3,2,4};
//  twoSum(arr,6);
//  arr['a']=1;
//  arr['A']=1;
//    System.out.print((char)1);
//
//    System.out.println('a');
    //    System.out.println(wonderfulSubstrings("aabb"));
//rotatedDigits(10);
//    int[] goods = new int[]{2,5,6,9};
//    List<Integer> collect = Arrays.stream(goods).boxed().collect(Collectors.toList());
//    System.out.println(countTriples(18));
//    String s ="tnapzbjeznakaxowyeqefiwxpoxswedvabnyyuihjenxmpzxyyokldoijgvekjxxvxsvcnrinonkofilfyllcacophzuusnbyhpxoqtnbhezbvwtnejsxcyxsbffqaxfryagvvzzvjvbdgrwkowqfwthrkkhxvmpqkslrfqcxmeiygryknhocdvwyomdzmcfvetugpldpbytefioyiyxjfqkdhbefrlwbgnodzbrknqeyjdcgjovtdfqobqxyqhqltrpizlxdnjdqezzwjaudlsofkvjykktlkjiksffefwrqxotkqfdcqhvuqbfoejnelskrhtoekufkmwdyiyptwrucawbwixfdfvjxpvmshcoxdknqeomzrxzrdltdjjearvypexzyoxzxbdhkdzurzisycpuaxkewehnxmxbghllbttlcodzqtajxjarsiuwukiysomgxxcrincvucbjeuuwaauwqeqwlwucdsftccyaugbcinmfzpehrwbeaefdozssbeizeqppnhlvtnrzgtbbitqvctsatcpxjrrbgvltmmtizepbjmmywzmxldtkadizqkaurepeckdiakhyofmslyezbybimhgyukaieqrlddhsuwjzblkfigwixzuopifdiqzfpgvmmanctqcmpxygluuhdwbgqivmdhizpnvqypdttfuhukvagdaqtcmxdqoptchhsledydwojisoqqkivahoowbsdbbdnygtziktmonqkevvlcxggqobvfbfgdwnitratmrsobpfpaspjxefnxthonefpiigdhapqnkebutwfotvrxvjbqowgnifeimsslktxmpuryccaabahalsycjqztjhqhaddlyzxdqyuwyecslxshaobrfkjalmeaxrywssfgrzervzbowosusthcjvojxsoiqkpjztdrxrkycgdyqlorxixzdiqtwozuvkvwzonogoytrumivjynvfjktcqlvxeauncdbygkvocvaadeubgykjkshkflpmpbmaiaswjocrqjzmabmxmocssxltgzaiuwfkadwuylnmskyqbpsmxhehicevfmauuxubeirvflsxcdtyoljsansqcmhokbgyjkxxwdeorlzjgbuekogddsabucrpawdxwuemmckqouddnwbnzogtvjfgblwuarykpwtdpuxqtephulabcxdqjkmuxhniiynkwrsypromcminqgghhnixxojhvnkglrtxduhrjoiupeswqfuveqmgmhondpgzvzaeyylzphofblzpmkdejubwhoguyrfxoaiqhlfqogovdoifuvfqyctzhmcvfleefcgippkfccsltjpjohwmunimqvpjspsjufikghgpmaygslukijmsxcgfjzmewqpvvzjtcxcsbcylhwhxfingcbruyyeoyxgvfsbcvedmtsdygawtnanbdbedwvohgecgqtbjalurkoknzyjpsttnknmufpjhpkjjifalqdwutqhgaflmmmwmkbyxxhbmkqlpjnmywmjfxezdshafnakulqhbndlmtausobzyjrlsgdxcjkbhyfokvdogxabwgmbmzymclxqzwygoxvirnrvpruugvlhyhzzbpugvovfymdcojtkicemybixlvemaydgwmypkwhpeeijccuaomczvqzaedzjrvjobxibpzpveekzcpqnvhbpgqscprawrsvjnhskugziigdecpdcldburpsldqyopyfmaeebawgemrksidizkixosauykmzdwgpyxskuqsujamvnfirtnnxzpplyulsootbikqumwyxpgiplhqbfxggnbylklyuhvoknyuqhpbzfrhdgzoiofrcqyadtgrrkxfecyioobzwwaguuyzcldtumdrhcujkeysxqztzeinrfztjiktcnvfequtbzfrxmukqfblajzyqkvzwcvpoddmzsiqaviivhwbhzdgjdikbnbihaziswypwjcgixefughvoowvoprhohxtbxkrgbbypcmmjogpouceqowqafseywnzanhuueobfrfnikpxhgwdkqmzkegdeqdrdbzttrdfyoqsvacfdsuwikrrlfqfjwwrmylgleuvtnfchhetmtblhffwvzhmlduqjzoqdgjgcwnikbycxggyywoyxqzayirooafchtgupqryojjqxiwjtnmlorcxgwfkzbrzldtfcgxkzqxxcypcgptygmhetsymzuxcnfoasytoetzorfvgbevfhblqassjttvlrvejeaevkcebklsesswnxpzpilvprflevlipyuvfhumcpudbtnwokqsvbewugbwobocncgovbmvduscdlkqctlrziaaaravaitvpceycuojutpszirunhheodrohntdvhqbjblapaggiijnnkogdhfirjvujbsqbfkwoquaqqyyebgbdkvdonaqgweymynjtnbgebsqheorskegksjsnfiucwvhzkjttwbkfrirhyxacjkhhovnxutjonezizmvbrarbwgxftjvgiskfdccpnsuopfpqffkifwwsyxpntikmnkowxaevzacucdpygjmsghzdskaqfjudbibdnuhofkmvptkesypnblikcyswhnktvquimklubsdduabfznfkwcwaelitcefxjvneomwloxqzvhzdhouzuigwxtnkfqpdcjravnzpbhoyslgukpoykqvwrvqttrtwcndupqodohuxouwyxcvufuuloybqaoeqlkxqefozfpirxqxnroavhaikrzxolauuktodrcooiqyfovcvwtuiiydvukdpuwhxwvetarnpxkzdzkfcfpvvayjbqcqbtbkeqfplkdsfhamlhesldkwrpiocwsvxyzoybuayrgzflcdyjyfxkmymfzxrcejfkvzimozjelxohpsepbwhbvlhblrvknyxtmnxbvqwxpvcfnzeotmtpglvwowweriaftyaupslrzlskygkudujaocveqiezrraizyrkdbqyboiklpbpuglphoaexaiapsrozprnhdwitnqqhlolvxsljexkkftraqhuzbqzmnjdqxnseviomtunraqrujswrwtksilarexetwgenlkdvpegyrtwuvfyoxockgrxetsyeykzeyfsiprcwycsjaqnyyoaimrvffqdrnpycmmbnspgavfhiliicsjxvmvnglwbygwsqcyuajlqydpmbtdmhdvnwjedivvlbiunullhemiitroipzuispedyxzvlidwwbujfqgydwwvuwbaiafqoechwnjpzmmwzflqlyqdajntejfynueovtebfdvahcjacggesmaemncluxmitjqmjwyiqnurlxoskoeldmbrfusyrzyyieooptwyturpqgogeqsgpxfoikmqtwfvhyoggvupselvwleebbgxmnmcmxipoxgdvtcukuwoewgopyxnnojftsjneqkbvtztfhhxqvwocbvefsxwadpuspjahmqtfpfakmfpczdbddfdrslmrbptcckdedslsrytyfqsaolinrlwvucthchurqdiarzdhdvpsjzsvbtrufrpdsmaczdhljijhyfayxuazykjegmbpbszlwafdhqxigwvrqfshgdqxkmxqjxiblrzjlegmcvglcotunbaxuocktcenonvrldaszsmfblgmfcbwjnhhuesaoennjllgadafrwfkvxlglkvcpnvsmazkliiptubprdgarpoybstwqhagzbubpnvhvvykpzqqfprvjohkjcfhbmggeietzrppxzlasxelzramnvoecberauqcyyyugrtopxuldczztnqzynvwzyxhdtlwjnyolnlaevgbmmcvvjcpcqcexrpuplxdskyrwrbbjsguuljbxqehxroijcypwrqeqxyshpjggpalibaocdzjtvkodnoufnnnpwdgmztlolqbhfvptsjtpvzwscfsxizbgocivaexhhddciafhaokbtmxtudgntqoyswmocchnzuvqxqyoqnugzkqlyjixcigircpsrbrmjsjsjbcrbvnuufiksdngjbmbpqhdnpehjjwutolmbugauiljtixouiifuuadwjuwuweksbkipfbsreeehzulwsmktpkcescjznynnkbtzamnkszdwepyluaulzkgevbsxbnftmfipktbozqjgnidotnwjtybrlhjqidfwcyesluptzrqvclutghqtmawojebmsrbwpkgbiqapufsndqfwwawwutnskmhxviegxyglvfnjbpfsoarturgpdlnrwtuolpnexrbzipdmhldjacsptjggxvqpegoczzrmkvyoznnbpyedvafxarklcxnqroumkachjuhxgoyqqcnbmktwqfiwpvuafuavkejvyyplbarlzrkcaqxhccvzfhvocpxpumnautlohdnoqepunoonqdnrqubauljvoxapdydwtjwqpveazoayxjdbliiyllsrdhpucrvohppyledyiplvwxgtgdvjhmviudvdvjvsatbkyxkylfdwmeeoisuacnyversgdkkyyujmbjosycozpvxcvcecwtfvubofabliaygszcnuoihvdompowkdgytktyundmuvcxsbgbjopfemhzuslnwgwdnkhoblfozzxynozifxuqwkdbillhbjqjjkfevpoitcmssrpxcccuyczaihyrbseasjgvysceacdliuowbekvxccfsewzrrgqqahymtsvmoyspjaftbakyqzuarpajywlnstboqxyzipxyjtgjodjbbzopqklxvbosmbsgmgrsyrohpzjfamjweifqvbfjgxecnebeysduiwbtabxkrjatoxngdxckfdyhryyltzozlwwcpplebygrwuxdjncmmapalciesoelycusejxunxsrolunfjocpitrmscobbzignvpfojynpxuhyibcnetebopnqvfreghmhfdtnckyjpfadqaafbysfdsmwdwgsbudcibgfrviugvljxcndbaepkwrtmjpwetndugvtvbkeoufdmnjojvvxltxjsycnkjhhtgrllzrpefkaqjldedwdhdfkdvirsgdrwqynmzyqtydgivcprgfigdzzyzejbnfgfvvgcvwnkjsjmsxogilpxuguxqyjgjmwkypnzbfhcijnxoyyxhcitpiyokvewglzdjszgkyhzyqpgxyvhiisbofufyranrdyvxddjocyhejzhxlxugvqrbmqeqvanuwvfllpkiemcxqbtsvvybyjqrbadwediirydahzrdxtnqczxffqjeuespeswuiszjxrfgequlsenpajmsxvufflnzmcbzbepudnewjcmecqyzfzrqecwrvlsgwumitdfzfrdyxnqthzizwosrrweykjvqzfrxgxumubqnhrmcgmiwyuqiarfkkburfvmjbsubiouyrjlsboxilaycspfiojemadgleaqqcschyotlyknqkonfemmcpudqraysznmojvyyrxsiccuieyruqedbdbvumjzolxmsakokirlkopyxcvkjrawakjsmatzoqzlcqqdsffspsejeekfhzwpxqooikxklhigxythgbxpkyptgswhlfwwgnrrodbikpmyzrnunwhgcaxodrcmbixnfqujmpwdgbhlhydpovdtjdctlwwnpepqvzoluxpygjhgikcfojxheverdwflekraglpnsukvvauzqsxohtyducrmxbgzhvbfuvyevphketsttfdzqgddkzfwffgmbrrllyawdmptixbhjbyegpuveahxubolyuvuxaleeuhwbvsxgwmucxqrigcupwybjonxerqiwbepuprkthgntymqlubedcbnzbszoutbxzbwwmsuypjpqgjptxccexytgoeawdcerrgwjyxtaofzhlxannnpihaewpjnjpwermqxkqfypigexmuejdkxjcvdroydhbyytfditsklmsekvsrybjignqocfcrtbhnwsevcwcvujhrwsnwonzhatciobihdvaueyxmqmvnuyqhwtudldhepsldbehbhpnuctyxowwcwlvkpzhrcescobwkareaaytofkwaqiegngsyoekveutblnlvtyweoxwnxrwfvktnqwzxttelgozczeruffpconzjetsbmstyaymkqkqjpaxncrguqmlklnczkwqohrerzvdkjykjewocifqpxeiprqalhdwagmtkpzblqmoophrgjqokbnuuwcmhlyikpvcjungiuequwievzedlkhpbvengnuawoerbmrogpmvtcjzgdyuxbfrstkpwpqazjhotelovzlonmsadmkqactlxdgxhzdpbmryoyvjhbdudxplmileyepifqrlammkorippicvgfavzhsfevxbtkryybsmyqqmeunogjiroephrjsikzijcbibwbiclhmtqjdlnttculjhuofhxfimnfdfcurgqxzlamnexbummavlibelhirysmuncoclmhwmtljevpbifkpoxqlzipourcnompngysesoknxehhyuhtxrsplowvxisjnytvbdlptpxvvvhoqxlcaiphzyvuufmwnkncsqfntwccgzmohxoxaurwvovvlpjdwypfucvinttmttrfratdgpaynwzhqidsbbnvuwsbiwhsfbisumjkxcrnpofgqsqozzvljylgqwvgmejwchkrbdngmlwoktjaxhnjgbskaczmyqfnvxkgzzarodzadkkyncqrlnppuyoobmgtxwqraenthplhiycsvtnxdmlxazuyzutvvutahfnnbmoltzfgktlvcspqcyfvwzeddgebgrewxpsjmatbbrrvhoejuvqbmqcqdtomptmtzwofecmhdhgxqfkcvbfjlrfmdkseydapugxkdofypampacgiuzalpctalecojbnwrmeavixutuzcevzmaggbzvthuxedqaifptdtysphvumeqfeqjcxmcmvsazdyvjocacocynxcuokthpnkmlwzrdmzxnhlatlrzzcahwdlbkttytyfpsdfifonhybefzkhesabetmydaxaffbanghskgcanouzdduaywjtqvdmytpnustqkothzyywomggbxvznrgdcvyccwirojgntzizegwajigkaiypgpswldbbdwsvsocnxqnptzdxdnnbgidfxqfiyfzahecuyoioryquziarxcameblaconlastezdtyljdrgnjmltfvxxtiszhedlzwhvaqiamtqftmdgokmkeyttdlykznwskjskddzyqlzwlwhqmvrpqjazcnnmhdgwvhhktjdcculgtjjoezrhhvtcsmfonmargfrunwusnhunzkwawvzeewirhuewdkitnaymcswkzfbsclvqxbchyfxmdcrtpmqkucqkytyrqtbncqvqvijadflfnsaxorvnadmtsmycarcqzexrwpzgmdfiflkwxauorsjjwnaqrhudwzevkazptowgraurjlrgwxjtwditvxvkayfjzyqtxewssqwphwnfaxtpvvifdjbmjuokhsgrywgocivwhmgzmvplyigitxcoblmudptmcjewqtvmfjdultzukmdjlafvmjutmztmsfmhfaelvvnileboiuknzxenhbkgaqjfmbvfiszkkdpfnsvpkragxnkresuugjanvumptyiwlgaeriltnwmiglcsavndefkvlfbeydctvvqmpzceuewjhvkoaeclpfweaekyooczgrgvbowlwtxucyluxryhfevexjfcvehlzxafottibwqpzisfpdszmocxdkjbzoldlkkiewohzpgtpasnohatztwabascyvpeuxuywgagoafxjffaejbvxuizcxfiisxfknoosffufewkelanjtnqdvutcwbutkxppydgmfmijexjpwqoxizcdkbfmgkywhirnxgcxsxlltaoetngwhesbrwjihsdpcgvnlxldmzjtwdcosguiyuptzhomlqvffgepojjqbisryhwinutnvoziluduankdpehfuwtcpeeejtnjuyktzloetwqcyughhopuprkvldkgvivzjfbvqagbtcfjfqdhmcpjabzydmakkytvbzwkfnyaofehcvrwrfwfkayqhcldfcjxhxfemxnmkxawfghqbhlbiinlzvmqehewhfhucmfiuunkgozewujfvdobrentgqzainixmyekhipaupfnglhwqthlynhlkjolqwwgkmrkgovzbrwcjnpablyevanisqvkhgkwaxfgglnfkqraksxdyeekwxqupulqlftrvbmfkhv";
//    System.out.println(longestPalindrome("aba"));
//    String s="civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
//    System.out.println(s.length());
//    System.out.println(Character.toUpperCase('a'));
//    System.out.println(Character.toUpperCase('*'));
//    System.out.println('z'-'A');
//    System.out.println(lll("AAabccccdd"));
//    System.out.println(convertToTitle(26));
//    System.out.println(reverseWords("    hello world!  "));
//    System.out.println(longestCommonStr("bbbaaaba","bbababbb"));
//    System.out.println("abcdef".indexOf("de"));
//    System.out.println("aabaa".contains("aa"));
    long inf = (long) 1e18;
    System.out.println(inf);
    int[][] dp = new int[3][5];
    Arrays.stream(dp[1]).max().getAsInt();
  }


  public static long maxPoints(int[][] points) {
    int m = points.length;
    int n = points[0].length;
    long[][] f = new long[m][n];
    for (int j = 0; j < n; ++j) {
      f[0][j] = points[0][j];
    }
    for (int i = 1; i < m; ++i) {

      long ret = f[i - 1][0] + 0;
      for (int j = 0; j < n; ++j) {
        ret = Math.max(ret, f[i - 1][j] + j);
        f[i][j] = points[i][j] - j + ret;
      }

      ret = f[i - 1][n - 1] - (n - 1);
      for (int j = n - 2; j >= 0; --j) {
        f[i][j] = Math.max(f[i][j], points[i][j] + j + ret);
        ret = Math.max(ret, f[i - 1][j] - j);
      }

    }
    return Arrays.stream(f[m - 1]).max().getAsLong();
//    long ans = 0;
//    for (int j = 0; j < n; ++j) {
//      ans = Math.max(ans, f[m - 1][j]);
//    }
//    return ans;
  }


  public static String longestCommonStr(String str1, String str2) {
    StringBuilder sb = new StringBuilder();
    int m = str1.length();
    int n = str2.length();
    int[][] dp = new int[m + 1][n + 1];
    int preMax = 0;
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
          if (dp[i][j] > preMax) {
            sb.append(str1.charAt(i - 1));
            preMax = dp[i][j];
          }
        } else {
          dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
        }
      }
    }
    System.out.println(dp[m][n]);
    return sb.toString();
  }

  public static String reverseWords(String s) {
    String[] arr = s.split(" ");
    System.out.println(Arrays.toString(arr));
    StringBuilder sb = new StringBuilder();
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i].equals(" ") || arr[i].equals("")) {
        continue;
      }
      System.out.println(arr[i]);
      sb.append(arr[i]);
      sb.append(" ");
    }
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }

  static int MOD = 26;

  public static String convertToTitle(int columnNumber) {
    StringBuilder sb = new StringBuilder();
    while (columnNumber > 0) {
      columnNumber--;
      System.out.println(columnNumber / MOD + "," + columnNumber % MOD);
      sb.insert(0, (char) (columnNumber % MOD + 'A'));
      columnNumber = columnNumber / MOD;
    }
    return sb.toString();
  }

  public static int lll(String s) {
    int[] count = new int[58];
    for (char c : s.toCharArray()) {
      count[c - 'A'] += 1;
      if (count[c - 'A'] > 2) {
        System.out.println(c + "," + count[c - 'A']);
      }
    }
    System.out.println(Arrays.toString(count));
    int sum = 0;
    for (int value : count) {
      System.out.println(sum);
      sum += (sum % 2) == 0 ? value : value - 1;
    }

    return sum < s.length() ? sum + 1 : sum;
  }

  public static String longestPalindrome(String s) {
    int start = 0;
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      int currentLen = Math.max(len(s, i, i), len(s, i, i + 1));
      if (currentLen > max) {
        max = currentLen;
        start = i - (currentLen - 1) / 2;
      }
    }
    return s.substring(start, max);
  }

  public static int len(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    return right - left - 1;
  }

  public static int countPalindromicSubsequence(String s) {
    if (s.length() < 3) {
      return 0;
    }
    Map<Character, List<Integer>> lookup = new HashMap();
    for (int i = s.length() - 1; i >= 0; i--) {
      lookup.putIfAbsent(s.charAt(i), new ArrayList<>());
      lookup.get(s.charAt(i)).add(i);
    }
    List<String> used = new ArrayList<>();
    Set<String> res = new HashSet<>();
    for (int mid = 1; mid <= s.length() - 2; mid++) {
      for (int i = mid + 1; i < s.length(); i++) {
        if (used.contains(String.valueOf(s.charAt(i)))) {
          continue;
        }
        List<Integer> list = lookup.get(s.charAt(i));
        if (null == list || list.size() == 0) {
          continue;
        }
        for (Integer index : list) {
          if (index < mid) {
            used.add(String.valueOf(s.charAt(i)));
            String s1 = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(mid)) + String.valueOf(s.charAt(i));
            res.add(s1);
            break;
          }
        }
      }
    }
    return res.size();
  }

  public static int nearestExit(char[][] maze, int[] entrance) {
    if (maze.length == 0 || maze[0].length == 0) {
      return 0;
    }
    int m = maze.length;
    int n = maze[0].length;
    //广度优先搜索
    int answer = -1;
    Deque<int[]> queue = new LinkedList<>();
    queue.offer(entrance);
    int step = -1;
    while (!queue.isEmpty()) {
      int size = queue.size();
      step++;
      while (size > 0) {
        int[] current = queue.poll();
        size--;
        int x = current[0];
        int y = current[1];
        if (!(x == entrance[0] && y == entrance[1]) && (x == 0 || y == 0 || x == m - 1 || y == n - 1)) {
          answer = Math.min(answer, step);
        }
        // 上
        if (y - 1 >= 0 && maze[x][y - 1] == '.') {
          queue.offer(new int[]{x, y - 1});
        }
        // 下
        if (y + 1 < n && maze[x][y + 1] == '.') {
          queue.offer(new int[]{x, y + 1});
        }
        //左
        if (x - 1 >= 0 && maze[x - 1][y] == '.') {
          queue.offer(new int[]{x - 1, y});
        }
        //右
        if (x + 1 < m && maze[x + 1][y] == '.') {
          queue.offer(new int[]{x + 1, y});
        }
      }
    }
    return answer;
  }


  public static int countTriples(int n) {
    int answer = 0;
    for (int i = 1; i <= n - 2; i++) {
      for (int j = i; j <= n - 1; j++) {
        double target = Math.sqrt((i + j) * (i + j) - 2 * i * j);
        if (Math.ceil(target) == Math.floor(target) && target > i && target > j && target <= n) {
          System.out.println(i + "," + j + "," + target);
          answer += 2;
        }
      }
    }
    return answer;
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> loopUp = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      loopUp.put(nums[i], i);
      System.out.println(nums[i] + ",," + i);
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.println(i + "," + nums[i] + "====>" + (target - nums[i]));
      if (loopUp.containsKey(target - nums[i])) {
        System.out.println("con");
        return new int[]{i, loopUp.get(target - nums[i])};
      }
    }
    return new int[2];
  }

}
