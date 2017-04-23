# Literature

Writers rating based on google search results and goodreads.com rates.<br/>

Current formula: r1 + r2 + 2 * r3, where

r1 - points from google search results by '%authorname%' query, e.g. 'Mark Twain' <br/>
r2 - points from google search results by '%authorname% writer' query, e.g. 'Mark Twain writer'<br/>
r3 - points from goodreads.com writer rating

All rates are normalized among authors.
If author has best goodreads.com rating among 100 other authors, he gains 100 points.
If author is #5 in google search results among 100 other authors, he gains 95 points and so on.

First number is author rating. Last three numbers are inverted r1, r2, r3 numbers.<br/>
E.g. Stephen King row means he is #2 in google search query, #1 in google search person query and #44 in goodreads.com


    3911   J. K. Rowling              1965..            England            18 18  1
    3602   Oscar Wilde                1856..1900        England            12 13 22
    3564   Edgar Poe                  1809..1849        USA                28 27  9
    3485   J. R. R. Tolkien           1892..1973        England            42 35  2
    3485   Arthur Conan Doyle         1859..1930        England            43 26  6
    3483   Victor Hugo                1802..1885        France              5 40 18
    3474   Carl Jung                  1875..1961        Switzerland        20 44  9
    3322   Stephen King               1947..            USA                 2  1 47
    3245   Simone de Beauvoir         1908..1986        France             35  8 31
    3067   Jane Austen                1775..1817        England            56 29 19
    3047   Martin Heidegger           1889..1976        Germany            47 28 25
    3034   Jack London                1876..1916        USA                 1  3 61
    3007   Friedrich Nietzsche        1844..1900        Germany            29 42 29
    2999   Fedor Dostoevskiy          1821..1881        Russia             61 47 11
    2980   Marcel Proust              1871..1922        France             89 33  5
    2977   Dante Alighieri            1265..1321        Italy              32 26 37
    2960   Ken Kesey                  1935..2001        USA                92 24  9
    2940   Mikhail Bulgakov           1891..1940        Russia             83 45  4
    2930   Antoine de Saint-Exupéry   1900..1940        France             55 74  4
    2906   Albert Camus               1913..1960        France             31  8 50
    2889   Alexander Pushkin          1799..1837        Russia             34 59 24
    2830   Alexandre Dumas            1802..1870        France             39 78 15
    2780   Charlotte Bronte           1816..1855        England            72 32 24
    2767   Agatha Christie            1890..1976        England            30 17 53
    2747   George Gordon Byron        1788..1824        England            26 21 54
    2731   Isaac Asimov               1920..1992        USA                60 63 17
    2712   Mikhail Lermontov          1814..1841        Russia             59 70 15
    2629   Ray Bradbury               1920..2012        USA                54 19 47
    2619   George Oruell              1903..1950        England            23 51 47
    2589   Philip K. Dick             1928..1982        USA                53  6 56
    2577   William Shakespeare        1564..1616        England             7  9 78
    2531   Hermann Hesse              1877..1962        Switzerland        45 46 43
    2526   Henry Miller               1891..1980        USA                 3  4 85
    2493   Nikolai Gogol              1809..1852        Ukraine            77 52 26
    2399   Immanuele Kant             1724..1804        Germany            36 12 71
    2391   Auldous Huxley             1894..1963        England            63 22 53
    2381   Gabriel García Márquez     1927..2014        Mexico             40 40 56
    2379   Richard Bach               1936..            USA                15 35 71
    2366   Stefan Zweig               1881..1942        Austria            84 90 10
    2352   Erich Maria Remarque       1898..1970        Germany            81 20 47
    2324   Kurt Vonnegut              1922..2007        USA                99 41 29
    2321   Umberto Eco                1932..2016        Italy               4 78 58
    2317   James Joyce                1882..1941        Ireland             6  2 95
    2310   F. Scott Fitzgerald        1896..1940        USA                52  5 71
    2283   Anton Chekhov              1860..1904        Russia             65 51 43
    2245   Boris Pasternak            1890..1960        Russia             67 81 29
    2243   Jean-Paul Sartre           1905..1980        France             41 65 50
    2230   Mark Twain                 1835..1910        USA                11 36 80
    2224   Arthur Schopenhauer        1788..1860        Germany            74 62 36
    2206   Soren Kierkegaard          1813..1855        Denmark            97 69 22
    2199   Sigmund Freud              1856..1939        Austria            25 11 87
    2157   Erich Fromm                1900..1980        Germany            79 102 17
    2151   Jules Verne                1828..1905        France             24 43 74
    2145   Lev Tolstoi                1828..1910        Russia             89 55 36
    2115   Charles Bukowski           1920..1994        USA                96 51 36
    2100   Voltaire                   1694..1798        France             14 24 91
    2087   Alexander Kuprin           1870..1938        Russia             87 91 22
    2080   Mary Shelley               1797..1851        England            17 15 95
    2078   Ethel Voynich              1864..1960        England            108 89 13
    2065   Oliver Sacks               1933..2015        England            58 80 43
    2053   Vladimir Lenin             1870..1924        Russia             33 66 63
    2052   Charles Dickens            1812..1870        England            16 53 78
    2023   Georg Hegel                1770..1831        Germany            70 16 71
    1962   Ernest Hemingway           1899..1961        USA                27 37 85
    1956   Baruch Spinoza             1632..1677        Denmark            93 56 43
    1941   Jonathan Swift             1667..1745        Ireland            22 10 102
    1940   Irvin D. Yalom             1931..            USA                104 107 13
    1924   Franz Kafka                1883..1924        Germany            38 58 71
    1911   George Sand                1804..1876        France              8 31 100
    1903   Herbert Wells              1866..1946        England             9 61 85
    1892   Jean-Jacques Rousseau      1712..1778        France             21 30 95
    1871   Adolph Hitler              1889..1945        Germany            13 14 108
    1822   Karl Marx                  1818..1883        Germany            10 40 99
    1747   Émile Zola                 1840..1902        France             46 88 61
    1737   Euripides                  480....406 B.C.   Ancient Greece     57 78 61
    1737   John Steinbeck             1902..1968        USA                66 65 63
    1729   Milan Kundera              1929..            Czech republic     76 96 43
    1698   Ivan Goncharov             1812..1891        Russia             81 84 48
    1694   Homer                      1100..1000 B.C.   Ancient Greece     19 60 91
    1646   J. D. Salinger             1919..2010        USA                51 51 82
    1630   Stanisław Lem              1921..2006        Ukraine            95 101 36
    1621   Mikhail Sholokhov          1905..1984        Russia             107 100 31
    1615   Johann Goethe              1749..1832        Germany            38 55 88
    1601   Carlos Castaneda           1925..1998        USA                102 97 36
    1598   Ivan Turgenev              1818..1883        Russia             71 72 64
    1550   Alexander Griboedov        1795..1829        Russia             91 99 43
    1389   Maxim Gorkiy               1868..1936        Russia             78 58 78
    1371   Jonathan Safran Foer       1977..            USA                95 93 53
    1279   Stendhal                   1783..1842        France             48 95 80
    1231   Guy de Maupassant          1850..1893        France             75 85 74
    1193   John Fowles                1926..2005        England            98 98 58
    1151   Theodore Draiser           1871..1945        USA                64 104 74
    1093   Vladimir Nabokov           1899..1977        Russia             100 92 65
    1031   Honoré de Balzac           1799..1850        France             87 67 87
    1011   J. M. Coetzee              1940..            South Africa       73 75 91
    0993   Aristophanes               446....386 B.C.   Ancient Greece     82 108 71
    0981   Denis Diderot              1713..1784        France             49 86 99
    0961   Molière                    1622..1673        France             50 87 99
    0960   Friedrich Engels           1820..1895        Germany            44 83 104
    0901   Gustave Flaubert           1821..1880        France             69 68 102
    0844   Chuck Palahniuk            1962..            USA                103 82 81
    0843   William Thackeray          1811..1863        England            90 73 92
    0782   William Golding            1911..1993        England            68 79 103
    0686   Bernard Werber             1961..            France             101 106 78
    0634   Sophocles                  497....406 B.C.   Ancient Greece     105 71 96
    0524   Frédéric Beigbeder         1965..            France             62 105 106
    0406   Eshil                      520....460 B.C.   Ancient Greece     87 94 105
    0089   Nikolay Chernishevskiy     1828..1889        Russia             106 103 107
