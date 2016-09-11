# Literature

Writers rating based on google search results and goodreads.com rates.<br/>

Current formula: 0.8 r1 + 0.8 r2 + 2.4 r3, where

r1 - google search results by '%authorname%' query, e.g. 'Mark Twain' <br/>
r2 - google search results by '%authorname% writer' query, e.g. 'Mark Twain writer'<br/>
r3 - goodreads.com writer rating

All rates are normalized among authors.
If author has best goodreads.com rating among 100 other authors, he gains 100 points.
If author is #5 in google search results among 100 other authors, he gains 95 points and so on.


    3344   Oscar Wilde                England          334.4 11 10 12
    3304   Edgar Poe                  USA              330.4 25 22 5
    3288   Arthur Conan Doyle         England          328.8 37 21 2
    3264   Victor Hugo                France           326.4 5 32 10
    3256   Carl Jung                  Switzerland      325.6 18 35 5
    3152   Stephen King               USA              315.2 2 1 26
    3080   Simone de Beauvoir         France           308.0 31 5 18
    3072   John Keats                 England          307.2 40 42 3
    3008   Jack London                USA              300.8 1 2 32
    2984   Charles Baudler            England          298.4 47 52 1
    2944   Martin Heidegger           Germany          294.4 42 23 14
    2944   Jane Austen                England          294.4 50 24 11
    2928   Dante Alighieri            Italy            292.8 28 21 20
    2920   Friedrich Nietzsche        Germany          292.0 26 33 17
    2912   Fedor Dostoevskiy          Russia           291.2 55 38 6
    2872   Albert Camus               France           287.2 27 5 28
    2847   Alexander Pushkin          Russia           284.8 30 50 13
    2775   Alexandre Dumas            France           277.6 35 69 8
    2768   George Gordon Byron        England          276.8 23 16 30
    2712   Isaac Asimov               USA              271.2 54 55 9
    2696   William Shakespeare        England          269.6 6 6 42
    2695   Mikhail Lermontov          Russia           269.6 53 61 8
    2680   George Oruell              England          268.0 20 42 26
    2680   Ray Bradbury               USA              268.0 48 14 26
    2664   Hermann Hesse              Switzerland      266.4 39 37 22
    2600   Henry Miller               USA              260.0 3 3 48
    2568   Immanuele Kant             Germany          256.8 32 8 38
    2552   Richard Bach               USA              255.2 14 28 38
    2528   Nikolai Gogol              Ukraine          252.8 71 43 15
    2512   Auldous Huxley             England          251.2 57 17 29
    2472   Umberto Eco                Italy            247.2 4 69 31
    2464   Anton Chekhov              Russia           246.4 59 42 22
    2456   Erich Maria Remarque       Germany          245.6 75 15 26
    2432   Mark Twain                 USA              243.2 10 29 44
    2400   Jules Verne                France           240.0 21 34 40
    2392   Jean-Paul Sartre           France           239.2 36 56 28
    2336   Boris Pasternak            Russia           233.6 60 72 17
    2320   Lev Tolstoi                Russia           232.0 82 46 19
    2320   Vladimir Lenin             Russia           232.0 29 57 33
    2320   Charles Dickens            England          232.0 15 44 42
    2224   Franz Kafka                Germany          222.4 34 49 38
    2216   Ernest Hemingway           USA              221.6 24 30 48
    2096   John Milton                England          209.6 66 9 46
    1992   J. D. Salinger             USA              199.2 46 42 46
    1968   Ivan Turgenev              Russia           196.8 64 63 34
    1712   Stendhal                   France           171.2 43 86 44
    1640   Theodore Draiser           USA              164.0 58 92 40
    1576   Vladimir Nabokov           Russia           157.6 90 83 35
    1480   Sigmund Freud              Austria          148.0 22 7 87
    1384   Voltaire                   France           138.4 13 19 90
    1368   Mary Shelley               England          136.8 16 12 92
    1336   Adolph Hitler              Germany          133.6 12 11 95
    1280   George Sand                France           128.0 7 26 94
    1240   Jean-Jacques Rousseau      France           124.0 19 25 92
    1240   Karl Marx                  Germany          124.0 9 32 93
    1224   Herbert Wells              England          122.4 8 53 87
    1104   Georg Hegel                Germany          110.4 63 13 87
    1096   Homer                      Ancient Greece   109.6 17 51 90
    1048   Johann Goethe              Germany          104.8 34 46 88
    0976   Charlotte Bronte           England          97.6 65 27 87
    0880   Ken Kesey                  USA              88.0 85 19 87
    0816   Friedrich Engels           Germany          81.6 38 74 87
    0808   Mikhail Bulgakov           Russia           80.8 77 36 87
    0800   Antoine de Saint-Exupéry   France           80.0 49 65 87
    0752   Émile Zola                 France           75.2 41 79 87
    0752   Euripides                  Ancient Greece   75.2 51 69 87
    0744   Maxim Gorkiy               Russia           74.4 72 49 87
    0744   Denis Diderot              France           74.4 44 77 87
    0744   Gustave Flaubert           France           74.4 62 59 87
    0736   Arthur Schopenhauer        Germany          73.6 68 54 87
    0728   Oliver Sacks               England          72.8 52 71 87
    0728   Molière                    France           72.8 45 78 87
    0664   William Golding            England          66.4 61 70 87
    0648   Baruch Spinoza             Denmark          64.8 86 47 87
    0648   J. M. Coetzee              South Africa     64.8 67 66 87
    0600   Honoré de Balzac           France           60.0 81 58 87
    0552   Guy de Maupassant          France           55.2 69 76 87
    0536   William Thackeray          England          53.6 83 64 87
    0528   Soren Kierkegaard          Denmark          52.8 88 60 87
    0520   Frédéric Beigbeder         France           52.0 56 93 87
    0512   Ivan Goncharov             Russia           51.2 75 75 87
    0472   Sophocles                  Ancient Greece   47.2 93 62 87
    0455   Milan Kundera              Czech republic   45.6 70 87 87
    0440   Stefan Zweig               Austria          44.0 78 81 87
    0408   Alexander Kuprin           Russia           40.8 81 82 87
    0408   Erich Fromm                Germany          40.8 73 90 87
    0400   Chuck Palahniuk            USA              40.0 91 73 87
    0384   Eshil                      Ancient Greece   38.4 81 85 87
    0344   Jonathan Safran Foer       USA              34.4 87 84 87
    0344   Aristophanes               Ancient Greece   34.4 76 95 87
    0328   Alexander Griboedov        Russia           32.8 84 89 87
    0312   Ethel Voynich              England          31.2 95 80 87
    0296   John Fowles                England          29.6 89 88 87
    0232   Nikolay Chernishevskiy     Russia           23.2 94 91 87
    0224   Irvin D. Yalom             USA              22.4 92 94 87