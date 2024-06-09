[#ftl]
[@c.page]
    <div class="detail">
        <div class="vizitka">
            <div class="jmeno">[#if vizitka.cele_jmeno??]${vizitka.cele_jmeno}[#else]<em>neuvedeno</em>[/#if]</div>
            <div class="udaje">
                <div class="adresa">
                    <div>[#if vizitka.ulice??]${vizitka.ulice}[#else]<em>neuvedeno</em>[/#if]</div>
                    <div>[#if vizitka.obec??]${vizitka.obec}[#else]<em>neuvedeno</em>[/#if]</div>
                    <div>[#if vizitka.psc??]${vizitka.psc}[#else]<em>neuvedeno</em>[/#if]</div>
                </div>
                <div class="kontakty">
                    <div><i class="bi bi-at"></i> [#if vizitka.email??]${vizitka.email}[#else]<em>neuvedeno</em>[/#if]</div>
                    <div><i class="bi bi-phone"></i> [#if vizitka.telefon??]${vizitka.telefon}[#else]<em>neuvedeno</em>[/#if]</div>
                    <div><i class="bi bi-globe"></i> [#if vizitka.web??]${vizitka.web}[#else]<em>neuvedeno</em>[/#if]</div>
                </div>
            </div>
        </div>

        <div class="mapa">
            <iframe style="border:none" src="https://frame.mapy.cz/?q=${vizitka.celaAdresa?url}" width="100%" height="100%" frameborder="0"></iframe>

        </div>

        [@c.back /]
    </div>
[/@c.page]
