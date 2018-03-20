/*
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class TestXMLTag {
   static String gftXml = "<?xml version = '1.0' encoding = 'UTF-8'?>\n" +
           "<!DOCTYPE TaskDetails SYSTEM \"WorkMgtReception_getFullTaskResponse.dtd\">\n" +
           "<TaskDetails>\n" +
           "    <Summary>\n" +
           "        <Sdbtext1>Task Type : LLU SFI2 field repair task : Guidance\n" +
           "            Task Automatically Allocated\n" +
           "            Cust Hazards : Access arrangements:\n" +
           "            No further hazards are present for this task\n" +
           "            Unit Hazard : DANGEROUS THINGS HERE\n" +
           "            Warnings : Currently there are no known Warnings for this task\n" +
           "            LOCAL LOOP UNBUNDLING\n" +
           "            Work Id/Tel: LLES9945578\n" +
           "            Customer  : Rakesh\n" +
           "            Address   : Accenture\n" +
           "            34740 Antas Green\n" +
           "            Highway\n" +
           "            EX4 3RX\n" +
           "            Rep Code  : BR  MWL/MFL   : CA\n" +
           "            Fault report is identified as Early Life Failure (ELF)\n" +
           "            ProductType: LLU1</Sdbtext1>\n" +
           "    </Summary>\n" +
           "    <Support>\n" +
           "        <Sdbtext1>Task Origin : CSSCE</Sdbtext1>\n" +
           "    </Support>\n" +
           "    <TaskDet>\n" +
           "        <Sdbtext1>Work_Id/Tel: LLES9945578\n" +
           "            COW: MDSL\n" +
           "            1141 Code : HIGH/HI  Imp. Class: 17  Imp. Score: 150\n" +
           "            System Type: ADSL  Exchange  : HIGH/HI\n" +
           "            Report Code: BR  MWL/MFL: CA  Service Affecting: Y\n" +
           "            Work Locn: CA EX4 3RX\n" +
           "            FAULT HISTORY PAGES\n" +
           "            Qualifier  Report  MFL  Product  FR      Report    Clear     Clear\n" +
           "            Code         Group    Status  Date      Date      Code\n" +
           "            BR      CA   MPF      AWI     09/02/17\n" +
           "            End of Fault History</Sdbtext1>\n" +
           "    </TaskDet>\n" +
           "    <Times>\n" +
           "        <Sdbtext1>Onsite Between: 10/02/17 07:30 - 13:00\n" +
           "            Complete By: 10/02/17 23:59</Sdbtext1>\n" +
           "    </Times>\n" +
           "    <Custdet>\n" +
           "        <Sdbtext1>Name   : Rakesh\n" +
           "            Address: Accenture\n" +
           "            34740 Antas Green\n" +
           "            Highway\n" +
           "            EX4 3RX\n" +
           "            WorkId/Tel: LLES9945578\n" +
           "            Line Status       : B/W\n" +
           "            Current Stat      : W\n" +
           "            Cust Type         : LU\n" +
           "            Product Mnemonic  : ELS\n" +
           "            Maint Service Code: 2\n" +
           "            CAPC indicator    : Y\n" +
           "            Exchange    : HIGH/HI\n" +
           "            Customer Product Details\n" +
           "            MSC R/S Grp   Qty  Description\n" +
           "            2   R   ELS   1    Exchange Line + NTE</Sdbtext1>\n" +
           "    </Custdet>\n" +
           "    <Notes>\n" +
           "        <Sdbtext1>GEN : Fault Reported By:TAGCP1@BT.COM TAGCP1@BT.COM  Tie Cable: En\n" +
           "            d User Disconnected:Y End User Name:Rakesh  End User Tel:810\n" +
           "            9253953 Customer Reference:1-98744212709 EU Contact: End Use\n" +
           "            r Name:Rakesh  TCD not Enabled  TCD Divert No: NO FAULT HIST\n" +
           "            ORY</Sdbtext1>\n" +
           "    </Notes>\n" +
           "    <Routing>\n" +
           "        <Sdbtext1>Line Status :B/W Current Status: W\n" +
           "            Circuit: LLES9945578 0 Stat: W\n" +
           "            DP  12    E      653\n" +
           "            MDF 1     D AA   1038</Sdbtext1>\n" +
           "    </Routing>\n" +
           "    <TaskPreview>\n" +
           "        <JIN>ES-ES1ABV38</JIN>\n" +
           "        <StartLocation>\n" +
           "            <GridRefEasting>29190</GridRefEasting>\n" +
           "            <GridRefNorthing>9280</GridRefNorthing>\n" +
           "        </StartLocation>\n" +
           "        <CommitmentType>A</CommitmentType>\n" +
           "        <PrimaryCommitmentTime>1486731600</PrimaryCommitmentTime>\n" +
           "        <PrimaryCommitmentTimeStr>2017-02-10 13:00:00</PrimaryCommitmentTimeStr>\n" +
           "        <AttendbyTime>1486731600</AttendbyTime>\n" +
           "        <AttendbyTimeStr>2017-02-10 13:00:00</AttendbyTimeStr>\n" +
           "        <AppointmentStartTime>1486711800</AppointmentStartTime>\n" +
           "        <AppointmentStartTimeStr>2017-02-10 07:30:00</AppointmentStartTimeStr>\n" +
           "        <AppointmentEndTime>1486731600</AppointmentEndTime>\n" +
           "        <AppointmentEndTimeStr>2017-02-10 13:00:00</AppointmentEndTimeStr>\n" +
           "        <AppointmentSlot>AM</AppointmentSlot>\n" +
           "        <ImportanceClass>17 was 18</ImportanceClass>\n" +
           "        <ImportanceScore>150</ImportanceScore>\n" +
           "        <BusinessAreaCode>ACT</BusinessAreaCode>\n" +
           "        <ExchangeName>ACTON</ExchangeName>\n" +
           "        <Postcode>EX4 3RX</Postcode>\n" +
           "        <MaintenanceServiceCode>2</MaintenanceServiceCode>\n" +
           "        <WorkId>LLES9945578</WorkId>\n" +
           "        <CurrentStatus>COM</CurrentStatus>\n" +
           "        <TimeRemaining>120</TimeRemaining>\n" +
           "        <ResponseCode>SH02</ResponseCode>\n" +
           "        <BusinessAssetTerminationIdCode>HIGH/HI</BusinessAssetTerminationIdCode>\n" +
           "        <MainWorkLocation>CA</MainWorkLocation>\n" +
           "        <Description>LLU SFI2 field repair task : Guidance</Description>\n" +
           "        <RealTimePriority>123</RealTimePriority>\n" +
           "        <TaskCategory>I</TaskCategory>\n" +
           "        <TwoManInd>N</TwoManInd>\n" +
           "        <LinkRole>N</LinkRole>\n" +
           "        <LinkType/>\n" +
           "        <TaskType>R1NALLSF2</TaskType>\n" +
           "        <JobType>VR7</JobType>\n" +
           "        <ParentTaskcat>R</ParentTaskcat>\n" +
           "        <ExternalTask>true</ExternalTask>\n" +
           "        <SchedulingStatus>NONE</SchedulingStatus>\n" +
           "        <PrepinnedTech>ESRKS22</PrepinnedTech>\n" +
           "        <COW>MDSL</COW>\n" +
           "        <PhysicalTravelTime>0</PhysicalTravelTime>\n" +
           "        <ParentMFL>CA</ParentMFL>\n" +
           "        <Requester>CSSCE</Requester>\n" +
           "        <SiteId/>\n" +
           "        <Scheduled>false</Scheduled>\n" +
           "        <TotalDuration>120</TotalDuration>\n" +
           "        <Skills>\n" +
           "            <SkillCode>RSFI2</SkillCode>\n" +
           "            <Duration>120</Duration>\n" +
           "            <SkillOrigin>E</SkillOrigin>\n" +
           "        </Skills>\n" +
           "        <ReportedTime>1486614120</ReportedTime>\n" +
           "        <ReportedTimeStr>2017-02-09 04:22:00</ReportedTimeStr>\n" +
           "        <RepeatReportIndicator>N</RepeatReportIndicator>\n" +
           "    </TaskPreview>\n" +
           "    <ScheduleDetails>\n" +
           "        <JIN>CE-ES1ABV38</JIN>\n" +
           "        <ExchangeName>ACTON</ExchangeName>\n" +
           "        <ResponseCode>SH02</ResponseCode>\n" +
           "        <TaskType>R1NALLSF2</TaskType>\n" +
           "        <Interruptible>N</Interruptible>\n" +
           "    </ScheduleDetails>\n" +
           "    <ControlDetails>\n" +
           "        <JIN>CE-ES1ABV38</JIN>\n" +
           "        <SystemType>ADSL</SystemType>\n" +
           "        <ZoneCode>CS</ZoneCode>\n" +
           "        <PrePinned>Y</PrePinned>\n" +
           "        <CurrentStatus>COM</CurrentStatus>\n" +
           "        <LatestProgressTime>1486618778</LatestProgressTime>\n" +
           "        <LatestProgressTimeStr>2017-02-09 05:39:38</LatestProgressTimeStr>\n" +
           "        <LastProgressor>ESRKS22</LastProgressor>\n" +
           "        <LatestProgressNote/>\n" +
           "        <SecondaryCommitmentTime>1486771199</SecondaryCommitmentTime>\n" +
           "        <SecondaryCommitmentTimeStr>2017-02-10 23:59:59</SecondaryCommitmentTimeStr>\n" +
           "        <OutOfHrsInd>N</OutOfHrsInd>\n" +
           "        <ManualInterruptInd>N</ManualInterruptInd>\n" +
           "        <InstallationId>702120350001</InstallationId>\n" +
           "        <Division>BASIC</Division>\n" +
           "        <StartLocation>\n" +
           "            <GridRefEasting>29190</GridRefEasting>\n" +
           "            <GridRefNorthing>9280</GridRefNorthing>\n" +
           "        </StartLocation>\n" +
           "        <ComplexTask>false</ComplexTask>\n" +
           "        <ArrivedAtTime>1486614120</ArrivedAtTime>\n" +
           "        <ArrivedAtTimeStr>2017-02-09 04:22:00</ArrivedAtTimeStr>\n" +
           "        <EaosTime>1486618140</EaosTime>\n" +
           "        <EaosTimeStr>2017-02-09 05:29:00</EaosTimeStr>\n" +
           "        <ServiceProvidedTime>1486618620</ServiceProvidedTime>\n" +
           "        <ServiceProvidedTimeStr>2017-02-09 05:37:00</ServiceProvidedTimeStr>\n" +
           "        <ClearCode>1513</ClearCode>\n" +
           "        <CustomerAgreedClear>Y</CustomerAgreedClear>\n" +
           "        <JobNotes>\n" +
           "            <NoteType>BTT</NoteType>\n" +
           "            <NoteText>Access arrangements: </NoteText>\n" +
           "            <NoteType>FIT</NoteType>\n" +
           "            <NoteText>\n" +
           "                2017-02-09 05:39:38 :\n" +
           "                09/02/2017 05:34:03- RAKESH KUMAR Notes- I completed t he ring ahead with t he end customer Rake sh and progressed to  their premises and  got access to the in ternal comm / equipm ent rooms and end cu stomer informed us o f a wi-fi issue. I w as unable to / did n ot to perform DeltaR  test because tester  was faulty. I perfo rmed PQT at the NTE  backplate and The te st passed on 09/02/2 017. I performed fin al PQT at the NTE ba ck plate and the tes t passed on 09/02/20 17. I performed fina l FastTest and the t est passed on 09/02/ 2017. PCP / SCP not  faulty but remade co nnections to protect  against future dete rioration.  === Ring ahead info rmation ===   Primary EU contact  name : Rakesh  Primary Contact no  : 8109253953  What was the outcom e of the call ? : Su ccessful call  Call date &amp; time :  2017-02-09T05:29:00  === Ring ahead info rmation ends ===  Wh at was the result of  the initial pair qu ality test ? - Fail Did you complete the  Base module ? - Yes Have you successfull y demonstrated conne ctivity to the NTE ?  - Yes Did all the connecti ons, extensions and  DSL filters meet the  minimum standards ?  - Yes Have you conducted a  sync test (modem li ght on) ? - Yes Did you replace the  NTE and why ? - Yes  - It was obsolete Did you complete the  end customer Premis es Wiring Module ? -  No Did you disconnect a ny end customer wiri ng to resolve a prob lem ? - No Did you complete the  end customer premis es equipment module  ? - No </NoteText>\n" +
           "            <NoteType>GEN</NoteType>\n" +
           "            <NoteText>Fault Reported By:TAGCP1@BT.COM TAGCP1@BT.COM  Tie Cable: En d User Disconnected:Y End User Name:Rakesh  End User Tel:810 9253953 Customer Reference:1-98744212709 EU Contact: End Use r Name:Rakesh  TCD not Enabled  TCD Divert No: NO FAULT HIST ORY </NoteText>\n" +
           "            <NoteType>HAZ</NoteType>\n" +
           "            <NoteText>Access arrangements: No further hazards are present for this task                 </NoteText>\n" +
           "            <NoteType>TSK</NoteType>\n" +
           "            <NoteText>Fault report is identified as Early Life Failure (ELF) ProductType: LLU1 </NoteText>\n" +
           "            <NoteType>WAR</NoteType>\n" +
           "            <NoteText>Currently there are no known Warnings for this task          </NoteText>\n" +
           "        </JobNotes>\n" +
           "    </ControlDetails>\n" +
           "    <BrowserListData>\n" +
           "        <Title>Summary</Title>\n" +
           "        <IconFilename>brbtnblank</IconFilename>\n" +
           "        <CompType>ROCVIEWER</CompType>\n" +
           "        <Tagname>SUMMARYSDBTEXT1</Tagname>\n" +
           "        <Title>Support</Title>\n" +
           "        <IconFilename>wmsupport</IconFilename>\n" +
           "        <CompType>ROCVIEWER</CompType>\n" +
           "        <Tagname>SUPPORTSDBTEXT1</Tagname>\n" +
           "        <Title>Task Details</Title>\n" +
           "        <IconFilename>taskdetails</IconFilename>\n" +
           "        <CompType>ROCVIEWER</CompType>\n" +
           "        <Tagname>TASKDETSDBTEXT1</Tagname>\n" +
           "        <Title>Times</Title>\n" +
           "        <IconFilename>clock</IconFilename>\n" +
           "        <CompType>ROCVIEWER</CompType>\n" +
           "        <Tagname>TIMESSDBTEXT1</Tagname>\n" +
           "        <Title>Cust Details</Title>\n" +
           "        <IconFilename>customerdetails</IconFilename>\n" +
           "        <CompType>ROCVIEWER</CompType>\n" +
           "        <Tagname>CUSTDETSDBTEXT1</Tagname>\n" +
           "        <Title>Notes</Title>\n" +
           "        <IconFilename>notes</IconFilename>\n" +
           "        <CompType>ROCVIEWER</CompType>\n" +
           "        <Tagname>NOTESSDBTEXT1</Tagname>\n" +
           "        <Title>Routing</Title>\n" +
           "        <IconFilename>routing</IconFilename>\n" +
           "        <CompType>ROCVIEWER</CompType>\n" +
           "        <Tagname>ROUTINGSDBTEXT1</Tagname>\n" +
           "        <Title>Progress</Title>\n" +
           "        <IconFilename>progress</IconFilename>\n" +
           "        <CompType>PROGRESS</CompType>\n" +
           "        <Tagname>NONE</Tagname>\n" +
           "        <Title>Task Preview</Title>\n" +
           "        <IconFilename>taskpreview</IconFilename>\n" +
           "        <CompType>TaskDetails</CompType>\n" +
           "        <Tagname>TASKPREVIEW</Tagname>\n" +
           "        <Title>Schedule Details</Title>\n" +
           "        <IconFilename>scheduledetails</IconFilename>\n" +
           "        <CompType>ScheduleDetails</CompType>\n" +
           "        <Tagname>SCHEDULEDETAILS</Tagname>\n" +
           "        <Title>Control Details</Title>\n" +
           "        <IconFilename>controldetails</IconFilename>\n" +
           "        <CompType>ControlDetails</CompType>\n" +
           "        <Tagname>CONTROLDETAILS</Tagname>\n" +
           "        <Title>FSI Details</Title>\n" +
           "        <IconFilename>fsidetails</IconFilename>\n" +
           "        <CompType>fsiDetails</CompType>\n" +
           "        <Tagname>FSIDETAILS</Tagname>\n" +
           "    </BrowserListData>\n" +
           "    <MiscInformation>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>AUTOAL</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>1</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>BUSTDT</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>10/02/17 17:00</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>CAPIND</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>Y</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>INSTID</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>702120350001</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>LNEACC</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>B/W</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>LNESTS</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>W</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>NUMTEC</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>1</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>PRODMN</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>ELS</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>REPDDT</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>09/02/17 04:19</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>SVCIND</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>Y</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>WB1000</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>N</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>CIRPRD</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>W</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>CIREDS</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>C            0</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>LOCLDS</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>1</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>TERMDS</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>12 D 653 0 E    </TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>TERMDS</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>1 M 1038 0 D AA   </TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>SPECDS</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>LLES9945578 0       </TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>BTPTYP</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>LLU1</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>BTTIDN</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>AF-AI-333454</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>FLTHIS</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>BR 09/02/17  CA MPF AWI    </TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "        <TemporaryItem>\n" +
           "            <TemporaryItemCode>CUSPRD</TemporaryItemCode>\n" +
           "            <TemporaryItemValue>2 ELS 1 Exchange Line + NTE R</TemporaryItemValue>\n" +
           "        </TemporaryItem>\n" +
           "    </MiscInformation>\n" +
           "    <LocationDetails>\n" +
           "        <WorkLocationQualifier>C</WorkLocationQualifier>\n" +
           "        <AddressLine>Accenture</AddressLine>\n" +
           "        <AddressLine>34740 Antas Green</AddressLine>\n" +
           "        <AddressLine>Highway</AddressLine>\n" +
           "        <AddressLine>EX4 3RX</AddressLine>\n" +
           "        <ContactName>Rakesh</ContactName>\n" +
           "        <ContactPhoneNo>8109253953</ContactPhoneNo>\n" +
           "    </LocationDetails>\n" +
           "    <CustomerDetails>\n" +
           "        <CustomerName>Rakesh</CustomerName>\n" +
           "    </CustomerDetails>\n" +
           "    <FieldSupportInformation xml:lang=\"en-GB\">\n" +
           "        <BTChecklistDs>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-11&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>What was the result of the initial pair quality test ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Fail]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-13&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did you complete the Base module ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Yes]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-101&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Have you successfully demonstrated connectivity to the NTE ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Yes]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-102&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did all the connections, extensions and DSL filters meet the minimum standards ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Yes]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-105&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Have you conducted a sync test (modem light on) ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Yes]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-10&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did you replace the NTE and why ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Yes - It was obsolete]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-19&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did you complete the end customer Premises Wiring Module ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[No]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-103&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did you disconnect any end customer wiring to resolve a problem ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[No]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-20&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did you complete the end customer premises equipment module ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[No]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist></BTChecklistDs>\n" +
           "        <BTFieldClientDetails>\n" +
           "            <BTClient>Engineer.com</BTClient>\n" +
           "            <EMPProductType>LLU1</EMPProductType>\n" +
           "            <SiebelReference>1-98744212709</SiebelReference>\n" +
           "            <BTOrderlineID>123456;31566</BTOrderlineID>\n" +
           "            <BTClientDetailsDs>\n" +
           "                <BTFieldInfo>\n" +
           "                    <BTFieldId>2045</BTFieldId>\n" +
           "                    <BTFieldSeqNo>3</BTFieldSeqNo>\n" +
           "                    <BTFieldResponse>&lt;![CDATA[Customer]]&gt;</BTFieldResponse>\n" +
           "                </BTFieldInfo>\n" +
           "                <BTFieldInfo>\n" +
           "                    <BTFieldId>2037</BTFieldId>\n" +
           "                    <BTFieldSeqNo>1</BTFieldSeqNo>\n" +
           "                    <BTFieldResponse>&lt;![CDATA[2037.02]]&gt;</BTFieldResponse>\n" +
           "                </BTFieldInfo>\n" +
           "                <BTFieldInfo>\n" +
           "                    <BTFieldId>2515</BTFieldId>\n" +
           "                    <BTFieldSeqNo>2</BTFieldSeqNo>\n" +
           "                    <BTFieldResponse>&lt;![CDATA[2515.04]]&gt;</BTFieldResponse>\n" +
           "                </BTFieldInfo>\n" +
           "                <BTDetailType>CS</BTDetailType>\n" +
           "            </BTClientDetailsDs>\n" +
           "            <BTClientDetailsDs>\n" +
           "                <BTFieldInfo>\n" +
           "                    <BTFieldId>1601</BTFieldId>\n" +
           "                    <BTFieldSeqNo>1</BTFieldSeqNo>\n" +
           "                    <BTFieldResponse>&lt;![CDATA[1601.01]]&gt;</BTFieldResponse>\n" +
           "                </BTFieldInfo>\n" +
           "                <BTDetailType>RA</BTDetailType>\n" +
           "            </BTClientDetailsDs>\n" +
           "            <BTClientDetailsDs>\n" +
           "                <TaskProgressStage>Q</TaskProgressStage>\n" +
           "                <BTFieldInfo>\n" +
           "                    <BTDetailFlag>External</BTDetailFlag>\n" +
           "                    <BTChkQuestionIDExternal>1602</BTChkQuestionIDExternal>\n" +
           "                    <BTChkResponseIDExternal>1602.01</BTChkResponseIDExternal>\n" +
           "                    <BTChkResponseTextExternal>&lt;I completed the ring ahead;gt;</BTChkResponseTextExternal>\n" +
           "                    <BTChkResponseSequence>0</BTChkResponseSequence>\n" +
           "                </BTFieldInfo>\n" +
           "            </BTClientDetailsDs>\n" +
           "            <BTClientDetailsDs>\n" +
           "                <TaskProgressStage>Q</TaskProgressStage>\n" +
           "                <BTFieldInfo>\n" +
           "                    <BTDetailFlag>External</BTDetailFlag>\n" +
           "                    <BTChkQuestionIDExternal>2801</BTChkQuestionIDExternal>\n" +
           "                    <BTChkResponseIDExternal>2801.01</BTChkResponseIDExternal>\n" +
           "                    <BTChkResponseTextExternal>&lt;I completed the ring ahead;gt;</BTChkResponseTextExternal>\n" +
           "                    <BTChkResponseSequence>0</BTChkResponseSequence>\n" +
           "                </BTFieldInfo>\n" +
           "            </BTClientDetailsDs>\n" +
           "            <BTClientDetailsDs>\n" +
           "                <TaskProgressStage>EAOS</TaskProgressStage>\n" +
           "                <BTFieldInfo>\n" +
           "                    <BTDetailFlag>External</BTDetailFlag>\n" +
           "                    <BTChkQuestionIDExternal>2272</BTChkQuestionIDExternal>\n" +
           "                    <BTChkResponseIDExternal>2272.01</BTChkResponseIDExternal>\n" +
           "                    <BTChkResponseTextExternal>&lt;Out of hours;gt;</BTChkResponseTextExternal>\n" +
           "                    <BTChkResponseSequence>0</BTChkResponseSequence>\n" +
           "                </BTFieldInfo>\n" +
           "            </BTClientDetailsDs>\n" +
           "        </BTFieldClientDetails>\n" +
           "        <FSINotes>&lt;TaskNotesDs>&lt;NoteType>ACC&lt;/NoteType>&lt;NoteText>Access arrangements: 09/02/2017 08:00:00&lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>FLT&lt;/NoteType>&lt;NoteText>Access arrangements:&lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>GEN&lt;/NoteType>&lt;NoteText>Fault Reported By:TAGCP1@BT.COM TAGCP1@BT.COM  Tie Cable: End User Disconnected:Y End User Name:Rakesh  End User Tel:8109253953 Customer Reference:1-98744212709 EU Contact: End User Name:Rakesh  TCD not Enabled  TCD Divert No: NO FAULT HISTORY&lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>FRM&lt;/NoteType>&lt;NoteText>Exchange Notes\n" +
           "            From                  To\n" +
           "\n" +
           "\n" +
           "\n" +
           "\n" +
           "\n" +
           "\n" +
           "            1/AA1038                  TAM.TAM001.02.001.032.O\n" +
           "            1-D-001-U02-007\n" +
           "            TAM.TAM001.02.001.032.I                  LLUT920397 00056 I\n" +
           "            1-E-001-U06-007                  1-E-003-U03-006\n" +
           "            LLUT920397 00056 O&lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>HAZ&lt;/NoteType>&lt;NoteText>Access arrangements: No further hazards are present for this task&lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>WAR&lt;/NoteType>&lt;NoteText>Currently there are no known Warnings for this task&lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>PRD&lt;/NoteType>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>FIT&lt;/NoteType>\n" +
           "            &lt;NoteText>09/02/2017 05:34:03-RAKESH KUMAR\n" +
           "\n" +
           "\n" +
           "            Notes- I completed the ring ahead with the end customer Rakesh and progressed to their premises and got access to the internal comm / equipment rooms and end customer informed us of a wi-fi issue. I was unable to / did not to perform DeltaR test because tester was faulty. I performed PQT at the NTE backplate and The test passed on 09/02/2017. I performed final PQT at the NTE back plate and the test passed on 09/02/2017. I performed final FastTest and the test passed on 09/02/2017. PCP / SCP not faulty but remade connections to protect against future deterioration.\n" +
           "            === Ring ahead information ===\n" +
           "\n" +
           "            Primary EU contact name : Rakesh\n" +
           "            Primary Contact no : 8109253953\n" +
           "            What was the outcome of the call ? : Successful call\n" +
           "            Call date &amp; time : 2017-02-09T05:29:00\n" +
           "\n" +
           "            === Ring ahead information ends ===  What was the result of the initial pair quality test ? - Fail\n" +
           "            Did you complete the Base module ? - Yes\n" +
           "            Have you successfully demonstrated connectivity to the NTE ? - Yes\n" +
           "            Did all the connections, extensions and DSL filters meet the minimum standards ? - Yes\n" +
           "            Have you conducted a sync test (modem light on) ? - Yes\n" +
           "            Did you replace the NTE and why ? - Yes - It was obsolete\n" +
           "            Did you complete the end customer Premises Wiring Module ? - No\n" +
           "            Did you disconnect any end customer wiring to resolve a problem ? - No\n" +
           "            Did you complete the end customer premises equipment module ? - No&lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;NoteDateTime>20170209053917&lt;/NoteDateTime>&lt;/TaskNotesDs>&lt;WMSId>WMC91&lt;/WMSId></FSINotes>\n" +
           "        <AdditionalProductDetails>\n" +
           "            <Upload>&lt;Pin>&lt;![CDATA[ESRKS22]]&gt;&lt;/Pin></Upload>\n" +
           "        </AdditionalProductDetails>\n" +
           "        <WMSInstance>WMC91</WMSInstance>\n" +
           "        <BThazardsAndWarningsDetails>\n" +
           "            <BTDownload>&lt;![CDATA[&lt;BTEUVisitOnlyTask>N&lt;/BTEUVisitOnlyTask>&lt;BTPCPOnlyTask>N&lt;/BTPCPOnlyTask>]]&gt;</BTDownload>\n" +
           "        </BThazardsAndWarningsDetails>\n" +
           "        <BTMHWSwitchIndicator>Y</BTMHWSwitchIndicator>\n" +
           "        <WLR>\n" +
           "            <EMPProductType>LLU1</EMPProductType>\n" +
           "            <ServiceType>MPF</ServiceType>\n" +
           "            <AssureOrFulfill>A</AssureOrFulfill>\n" +
           "            <NEOJIN>C9-233578</NEOJIN>\n" +
           "            <CSSJIN>ES-ES1ABV38</CSSJIN>\n" +
           "        </WLR>\n" +
           "        <RoutingChanges>\n" +
           "            <RouteData>\n" +
           "                <NodeDetails>\n" +
           "                    <NodeId>12</NodeId>\n" +
           "                    <NodeCat>D</NodeCat>\n" +
           "                    <NodeSide>E</NodeSide>\n" +
           "                    <TermNum>653</TermNum>\n" +
           "                </NodeDetails>\n" +
           "                <NodeDetails>\n" +
           "                    <NodeId>1</NodeId>\n" +
           "                    <SubNodeId>AA</SubNodeId>\n" +
           "                    <NodeCat>M</NodeCat>\n" +
           "                    <NodeSide>D</NodeSide>\n" +
           "                    <TermNum>1038</TermNum>\n" +
           "                </NodeDetails>\n" +
           "                <LineNum>0000</LineNum>\n" +
           "            </RouteData>\n" +
           "        </RoutingChanges>\n" +
           "        <TRCData>\n" +
           "            <Download>\n" +
           "                <AuthorisationBandHours>0000</AuthorisationBandHours>\n" +
           "            </Download>\n" +
           "        </TRCData>\n" +
           "        <AddTaskInfo>\n" +
           "            <Download>\n" +
           "                <EUCntactDetails>8109253953</EUCntactDetails>\n" +
           "                <BTEUAltContactNo>9993206354</BTEUAltContactNo>\n" +
           "                <Access24Hr>N</Access24Hr>\n" +
           "                <OpenreachFaultRef>1-98744212709</OpenreachFaultRef>\n" +
           "                <CPName>TAG CP1</CPName>\n" +
           "                <EUSecondName>Mr Sam Beggs</EUSecondName>\n" +
           "                <EarliestNextAccessTime>09/02/17 08:00</EarliestNextAccessTime>\n" +
           "                <EUSecondCntactDetails>98563324519</EUSecondCntactDetails>\n" +
           "                <RetailerName>BT RETAIL</RetailerName>\n" +
           "                <RetailerID>ABC</RetailerID>\n" +
           "                <CPFaultRef>LLES9945578_MPF</CPFaultRef>\n" +
           "                <EUName>Rakesh</EUName>\n" +
           "            </Download>\n" +
           "        </AddTaskInfo>\n" +
           "        <ExtendedClosureData>\n" +
           "            <ROUTING/>\n" +
           "            <CLOSURE>\n" +
           "                <CLOSURE_COMPLETE>Y</CLOSURE_COMPLETE>\n" +
           "                <EAOS_DATE>1486618140</EAOS_DATE>\n" +
           "                <DATE_JOB_COMPLETE>1486618757</DATE_JOB_COMPLETE>\n" +
           "                <CSS_PRODUCT_ID>A18516</CSS_PRODUCT_ID>\n" +
           "                <CUSTOMER_AGREED_CLEAR>Y</CUSTOMER_AGREED_CLEAR>\n" +
           "                <FAULT_CLEAR_CODE>151.3</FAULT_CLEAR_CODE>\n" +
           "                <DATE_RESPONDED>1486618620</DATE_RESPONDED>\n" +
           "                <DATE_FAULT_CLEARED>1486618620</DATE_FAULT_CLEARED>\n" +
           "            </CLOSURE>\n" +
           "        </ExtendedClosureData>\n" +
           "    </FieldSupportInformation>\n" +
           "    <ResourceRequirementsDs>\n" +
           "        <MinimumResource>1</MinimumResource>\n" +
           "        <OptimumResource>1</OptimumResource>\n" +
           "        <MaximumResource>1</MaximumResource>\n" +
           "    </ResourceRequirementsDs>\n" +
           "</TaskDetails>\n";

   String getGftXmlForTagCheck="*/
/*<xml version = '1.0' encoding = 'UTF-8'?>\n" +
           "<!DOCTYPE TaskDetails SYSTEM \"WorkMgtReception_getFullTaskResponse.dtd\">\n" +
           "<TaskDetails>\n" +
           "               <Summary>\n" +
           "                              <Sdbtext1>Task Type : NI complex task Service has been affected \n" +
           "Task Automatically Allocated \n" +
           "Cust Hazards :        No Data Available Via Ewocs       \n" +
           "Warnings :        No Data Available Via Ewocs       \n" +
           "Work Id/Tel: 012987/011  \n" +
           "Extern Ref: LFSC/E503UG  Qty: 1 \n" +
           "Customer  : FIRSTNAME \n" +
           "            SURNAME \n" +
           "Address   : LONDON \n" +
           "MWL/MFL   : LN \n" +
           "       ************** AUTO BUILT EWOCS Primary Task ******** \n" +
           "****** ****** Reminder: Only Complete Fully completed tasks  \n" +
           " ****** Contact Name: FIRSTNAME  SURNAME CONTACT: 01908 6248 \n" +
           "644 ADDRESS IS LONDON ORDER DESCRIPTION FIB REAC BLD (PRIM)  \n" +
           " CASE TASKS 1#NI7F#Prov/Rec Blown Fib  Cabling U/G per 100m  \n" +
           " ClAIMED WAU's 0#NI7F# (0:00)  Remaining WAU's 1#NI7F # (0:2 \n" +
           "4) ********************************************************* \n" +
           "***CASE NOTES         \n" +
           "ProductType: COMPLEX \n" +
           "&lt;a href=\"       http://ewocsjobpack.nat.bt.com:80/ORjobpackr \n" +
           "etrievalweb/default.aspx?id=NONE      \"> \n" +
           "Click here for Job Pack &lt;/a></Sdbtext1>\n" +
           "               </Summary>\n" +
           "               <Support>\n" +
           "                              <Sdbtext1>Task Origin : EWOEO</Sdbtext1>\n" +
           "               </Support>\n" +
           "               <TaskDet>\n" +
           "                              <Sdbtext1>Work_Id/Tel: 012987/011  \n" +
           "COW: MISC \n" +
           "1141 Code : L/MAY  Imp. Class: 18  Imp. Score: 100 \n" +
           "System Type: TM  Exchange  : MAYFAIR \n" +
           "MWL/MFL: LN   \n" +
           "Work Locn: LN N10 3AY</Sdbtext1>\n" +
           "               </TaskDet>\n" +
           "               <Times>\n" +
           "                              <Sdbtext1>   Complete By: 24/11/16 23:59</Sdbtext1>\n" +
           "               </Times>\n" +
           "               <Custdet>\n" +
           "                              <Sdbtext1>Name   : FIRSTNAME \n" +
           "         SURNAME \n" +
           "Address: LONDON \n" +
           "WorkId/Tel: 012987/011  \n" +
           "Exchange    : MAYFAIR</Sdbtext1>\n" +
           "               </Custdet>\n" +
           "               <Notes>\n" +
           "                              <Sdbtext1>GEN :        CASE NOTES         </Sdbtext1>\n" +
           "               </Notes>\n" +
           "               <Routing>\n" +
           "                              <Sdbtext1>Circuit: 012987 0 Stat: P</Sdbtext1>\n" +
           "               </Routing>\n" +
           "               <TaskPreview>\n" +
           "                              <JIN>EO-E503DG263</JIN>\n" +
           "                              <StartLocation>\n" +
           "                                             <GridRefEasting>52840</GridRefEasting>\n" +
           "                                             <GridRefNorthing>18940</GridRefNorthing>\n" +
           "                              </StartLocation>\n" +
           "                              <CommitmentType>S</CommitmentType>\n" +
           "                              <PrimaryCommitmentTime>1479918960</PrimaryCommitmentTime>\n" +
           "                              <PrimaryCommitmentTimeStr>2016-11-23 16:36:00</PrimaryCommitmentTimeStr>\n" +
           "                              <AttendbyTime>1479918960</AttendbyTime>\n" +
           "                              <AttendbyTimeStr>2016-11-23 16:36:00</AttendbyTimeStr>\n" +
           "                              <ImportanceClass>18 was 19</ImportanceClass>\n" +
           "                              <ImportanceScore>100</ImportanceScore>\n" +
           "                              <BusinessAreaCode>WMAY</BusinessAreaCode>\n" +
           "                              <ExchangeName>MAYFAIR</ExchangeName>\n" +
           "                              <Postcode>N10 3AY</Postcode>\n" +
           "                              <WorkId>012987/011</WorkId>\n" +
           "                              <CurrentStatus>ACT</CurrentStatus>\n" +
           "                              <TimeRemaining>24</TimeRemaining>\n" +
           "                              <ResponseCode>NONE</ResponseCode>\n" +
           "                              <BusinessAssetTerminationIdCode>L/MAY</BusinessAssetTerminationIdCode>\n" +
           "                              <MainWorkLocation>LN</MainWorkLocation>\n" +
           "                              <Description>NI complex task Service has been affected</Description>\n" +
           "                              <RealTimePriority>999</RealTimePriority>\n" +
           "                              <TaskCategory>N</TaskCategory>\n" +
           "                              <TwoManInd>N</TwoManInd>\n" +
           "                              <LinkRole>N</LinkRole>\n" +
           "                              <LinkType/>\n" +
           "                              <TaskType>COMPLEX</TaskType>\n" +
           "                              <JobType>CMP</JobType>\n" +
           "                              <ParentTaskcat>N</ParentTaskcat>\n" +
           "                              <ExternalTask>true</ExternalTask>\n" +
           "                              <SchedulingStatus>NONE</SchedulingStatus>\n" +
           "                              <PrepinnedTech>EARIS01</PrepinnedTech>\n" +
           "                              <COW>MISC</COW>\n" +
           "                              <PhysicalTravelTime>0</PhysicalTravelTime>\n" +
           "                              <ParentMFL>CA</ParentMFL>\n" +
           "                              <Requester>EWOEO</Requester>\n" +
           "                              <SiteId/>\n" +
           "                              <Scheduled>false</Scheduled>\n" +
           "                              <TotalDuration>24</TotalDuration>\n" +
           "                              <Skills>\n" +
           "                                             <SkillCode>ACFC</SkillCode>\n" +
           "                                             <Duration>24</Duration>\n" +
           "                                             <SkillOrigin>E</SkillOrigin>\n" +
           "                              </Skills>\n" +
           "                              <ReportedTime>1493374110</ReportedTime>\n" +
           "                              <ReportedTimeStr>2017-04-28 11:08:30</ReportedTimeStr>\n" +
           "               </TaskPreview>\n" +
           "               <ScheduleDetails>\n" +
           "                              <JIN>EO-E503DG263</JIN>\n" +
           "                              <ExchangeName>MAYFAIR</ExchangeName>\n" +
           "                              <ResponseCode>NONE</ResponseCode>\n" +
           "                              <TaskType>COMPLEX</TaskType>\n" +
           "                              <Interruptible>N</Interruptible>\n" +
           "               </ScheduleDetails>\n" +
           "               <ControlDetails>\n" +
           "                              <JIN>EO-E503DG263</JIN>\n" +
           "                              <SystemType>TM</SystemType>\n" +
           "                              <ZoneCode>HC</ZoneCode>\n" +
           "                              <PrePinned>Y</PrePinned>\n" +
           "                              <CurrentStatus>ACT</CurrentStatus>\n" +
           "                              <LatestProgressTime>1493374110</LatestProgressTime>\n" +
           "                              <LatestProgressTimeStr>2017-04-28 11:08:30</LatestProgressTimeStr>\n" +
           "                              <LastProgressor>EARIS01</LastProgressor>\n" +
           "                              <LatestProgressNote>GWI INIT received from system EWOEO\n" +
           "                              </LatestProgressNote>\n" +
           "                              <SecondaryCommitmentTime>1480031940</SecondaryCommitmentTime>\n" +
           "                              <SecondaryCommitmentTimeStr>2016-11-24 23:59:00</SecondaryCommitmentTimeStr>\n" +
           "                              <OutOfHrsInd>N</OutOfHrsInd>\n" +
           "                              <ManualInterruptInd>N</ManualInterruptInd>\n" +
           "                              <InstallationId/>\n" +
           "                              <Division>BASIC</Division>\n" +
           "                              <StartLocation>\n" +
           "                                             <GridRefEasting>52840</GridRefEasting>\n" +
           "                                             <GridRefNorthing>18940</GridRefNorthing>\n" +
           "                              </StartLocation>\n" +
           "                              <ComplexTask>false</ComplexTask>\n" +
           "                              <ArrivedAtTime>1493374110</ArrivedAtTime>\n" +
           "                              <ArrivedAtTimeStr>2017-04-28 11:08:30</ArrivedAtTimeStr>\n" +
           "                              <ExternalTaskRef>LFSC/E503UG</ExternalTaskRef>\n" +
           "                              <ClearCode/>\n" +
           "                              <CustomerAgreedClear/>\n" +
           "                              <JobNotes>\n" +
           "                                             <NoteType>BTT</NoteType>\n" +
           "                                             <NoteText>       There are no Technical Notes       </NoteText>\n" +
           "                                             <NoteType>GEN</NoteType>\n" +
           "                                             <NoteText>       CASE NOTES          </NoteText>\n" +
           "                                             <NoteType>HAZ</NoteType>\n" +
           "                                             <NoteText>       No Data Available Via Ewocs       </NoteText>\n" +
           "                                             <NoteType>TSK</NoteType>\n" +
           "                                             <NoteText>       ************** AUTO BUILT EWOCS Primary Task ******** ****** ****** Reminder: Only Complete Fully completed tasks   ****** Contact Name: FIRSTNAME  SURNAME CONTACT: 01908 6248 644 ADDRESS IS LONDON ORDER DESCRIPTION FIB REAC BLD (PRIM)   CASE TASKS 1#NI7F#Prov/Rec Blown Fib  Cabling U/G per 100m   ClAIMED WAU's 0#NI7F# (0:00)  Remaining WAU's 1#NI7F # (0:2 4) ********************************************************* ***CASE NOTES         ProductType: COMPLEX &lt;a href=\"       http://ewocsjobpack.nat.bt.com:80/ORjobpackr etrievalweb/default.aspx?id=NONE      \"> Click here for Job Pack &lt;/a> </NoteText>\n" +
           "                                             <NoteType>WAR</NoteType>\n" +
           "                                             <NoteText>       No Data Available Via Ewocs       </NoteText>\n" +
           "                              </JobNotes>\n" +
           "               </ControlDetails>\n" +
           "               <BrowserListData>\n" +
           "                              <Title>Summary</Title>\n" +
           "                              <IconFilename>brbtnblank</IconFilename>\n" +
           "                              <CompType>ROCVIEWER</CompType>\n" +
           "                              <Tagname>SUMMARYSDBTEXT1</Tagname>\n" +
           "                              <Title>Support</Title>\n" +
           "                              <IconFilename>wmsupport</IconFilename>\n" +
           "                              <CompType>ROCVIEWER</CompType>\n" +
           "                              <Tagname>SUPPORTSDBTEXT1</Tagname>\n" +
           "                              <Title>Task Details</Title>\n" +
           "                              <IconFilename>taskdetails</IconFilename>\n" +
           "                              <CompType>ROCVIEWER</CompType>\n" +
           "                              <Tagname>TASKDETSDBTEXT1</Tagname>\n" +
           "                              <Title>Times</Title>\n" +
           "                              <IconFilename>clock</IconFilename>\n" +
           "                              <CompType>ROCVIEWER</CompType>\n" +
           "                              <Tagname>TIMESSDBTEXT1</Tagname>\n" +
           "                              <Title>Cust Details</Title>\n" +
           "                              <IconFilename>customerdetails</IconFilename>\n" +
           "                              <CompType>ROCVIEWER</CompType>\n" +
           "                              <Tagname>CUSTDETSDBTEXT1</Tagname>\n" +
           "                              <Title>Notes</Title>\n" +
           "                              <IconFilename>notes</IconFilename>\n" +
           "                              <CompType>ROCVIEWER</CompType>\n" +
           "                              <Tagname>NOTESSDBTEXT1</Tagname>\n" +
           "                              <Title>Routing</Title>\n" +
           "                              <IconFilename>routing</IconFilename>\n" +
           "                              <CompType>ROCVIEWER</CompType>\n" +
           "                              <Tagname>ROUTINGSDBTEXT1</Tagname>\n" +
           "                              <Title>Progress</Title>\n" +
           "                              <IconFilename>progress</IconFilename>\n" +
           "                              <CompType>PROGRESS</CompType>\n" +
           "                              <Tagname>NONE</Tagname>\n" +
           "                              <Title>Task Preview</Title>\n" +
           "                              <IconFilename>taskpreview</IconFilename>\n" +
           "                              <CompType>TaskDetails</CompType>\n" +
           "                              <Tagname>TASKPREVIEW</Tagname>\n" +
           "                              <Title>Schedule Details</Title>\n" +
           "                              <IconFilename>scheduledetails</IconFilename>\n" +
           "                              <CompType>ScheduleDetails</CompType>\n" +
           "                              <Tagname>SCHEDULEDETAILS</Tagname>\n" +
           "                              <Title>Control Details</Title>\n" +
           "                              <IconFilename>controldetails</IconFilename>\n" +
           "                              <CompType>ControlDetails</CompType>\n" +
           "                              <Tagname>CONTROLDETAILS</Tagname>\n" +
           "                              <Title>FSI Details</Title>\n" +
           "                              <IconFilename>fsidetails</IconFilename>\n" +
           "                              <CompType>fsiDetails</CompType>\n" +
           "                              <Tagname>FSIDETAILS</Tagname>\n" +
           "               </BrowserListData>\n" +
           "               <MiscInformation>\n" +
           "                              <TemporaryItem>\n" +
           "                                             <TemporaryItemCode>AUTOAL</TemporaryItemCode>\n" +
           "                                             <TemporaryItemValue>1</TemporaryItemValue>\n" +
           "                              </TemporaryItem>\n" +
           "                              <TemporaryItem>\n" +
           "                                             <TemporaryItemCode>CIRQTY</TemporaryItemCode>\n" +
           "                                             <TemporaryItemValue>1</TemporaryItemValue>\n" +
           "                              </TemporaryItem>\n" +
           "                              <TemporaryItem>\n" +
           "                                             <TemporaryItemCode>NUMTEC</TemporaryItemCode>\n" +
           "                                             <TemporaryItemValue>1</TemporaryItemValue>\n" +
           "                              </TemporaryItem>\n" +
           "                              <TemporaryItem>\n" +
           "                                             <TemporaryItemCode>REPDDT</TemporaryItemCode>\n" +
           "                                             <TemporaryItemValue>28/04/17 11:08</TemporaryItemValue>\n" +
           "                              </TemporaryItem>\n" +
           "                              <TemporaryItem>\n" +
           "                                             <TemporaryItemCode>CIRPRD</TemporaryItemCode>\n" +
           "                                             <TemporaryItemValue>P</TemporaryItemValue>\n" +
           "                              </TemporaryItem>\n" +
           "                              <TemporaryItem>\n" +
           "                                             <TemporaryItemCode>SPECDS</TemporaryItemCode>\n" +
           "                                             <TemporaryItemValue>012987 0       </TemporaryItemValue>\n" +
           "                              </TemporaryItem>\n" +
           "                              <TemporaryItem>\n" +
           "                                             <TemporaryItemCode>BTPTYP</TemporaryItemCode>\n" +
           "                                             <TemporaryItemValue>COMPLEX</TemporaryItemValue>\n" +
           "                              </TemporaryItem>\n" +
           "                              <TemporaryItem>\n" +
           "                                             <TemporaryItemCode>BTTIDN</TemporaryItemCode>\n" +
           "                                             <TemporaryItemValue>1112683263</TemporaryItemValue>\n" +
           "                              </TemporaryItem>\n" +
           "               </MiscInformation>\n" +
           "               <LocationDetails>\n" +
           "                              <WorkLocationQualifier>C</WorkLocationQualifier>\n" +
           "                              <AddressLine>LONDON</AddressLine>\n" +
           "                              <ContactName>FIRSTNAME SURNAME</ContactName>\n" +
           "                              <ContactPhoneNo>01908 6248644</ContactPhoneNo>\n" +
           "               </LocationDetails>\n" +
           "               <CustomerDetails>\n" +
           "                              <CustomerName>FIRSTNAME\n" +
           "SURNAME</CustomerName>\n" +
           "               </CustomerDetails>\n" +
           "               <FieldSupportInformation xml:lang=\"en-GB\">\n" +
           "                              <WMIGIndicator>\n" +
           "                                                            Y\n" +
           "                              </WMIGIndicator>\n" +
           "                              <BTMainWorkLocation>LN</BTMainWorkLocation>\n" +
           "                              <BTTaskCat>N</BTTaskCat>\n" +
           "                              <BTONTTimeOutPeriod>30000</BTONTTimeOutPeriod>\n" +
           "                              <BTSourceSystem>EWOEO</BTSourceSystem>\n" +
           "                              <BTA1024Enable>\n" +
           "                                                                                          Y\n" +
           "                              </BTA1024Enable>\n" +
           "                              <BTTaskTypeId>COMPLEX</BTTaskTypeId>\n" +
           "                              <BTJobPackURL>\n" +
           "                                                                                          http://ewocsjobpack.nat.bt.com:80/ORjobpackretrievalweb/default.aspx?id=NONE\n" +
           "                              </BTJobPackURL>\n" +
           "                              <BTProductQtyDs>&lt;BTProductAndQuantityDetails>&lt;BTOrderProductQuantity>+1&lt;/BTOrderProductQuantity>&lt;BTProductDescription>Prov/Rec Blown Fib  Cabling U/G per 100m&lt;/BTProductDescription>&lt;BTProductServiceId>NI7F&lt;/BTProductServiceId>&lt;BTSingleUnitTime>.4&lt;/BTSingleUnitTime>&lt;BTUnitOfIssue>\n" +
           "                                                                                                                                       Per 100M\n" +
           "                                                                                                                        &lt;/BTUnitOfIssue>&lt;BTWAUProductLongDescription>\n" +
           "                                                                                                                                       All activities necessary to blow a fibre cable into or out of an existing or pre-installed sub-duct including but not limited to:  Setting up blowing equipment; Preparing sub duct and cable ends (links swivels, grips); Fleeting cable; Blow in cable; Jointing sub duct; Cap end; providing certified records.\n" +
           "                                                                                                                        &lt;/BTWAUProductLongDescription>&lt;BTWAUUsage>\n" +
           "                                                                                                                                       Blowing of COF or miniCOF into a subduct or mini subduct. Total lengths installed centre to centre on job rounded to next 100M. Allow set ups for blowing points.\n" +
           "                                                                                                                        &lt;/BTWAUUsage>&lt;BTEngineeringActivity>Fibre Blowing&lt;/BTEngineeringActivity>&lt;/BTProductAndQuantityDetails></BTProductQtyDs>\n" +
           "                              <FSINotes>&lt;WMSId>WMC96&lt;/WMSId>&lt;TaskNotesDs>&lt;NoteType>LTS&lt;/NoteType>&lt;NoteText>\n" +
           "                                                                                          No Data Available Via Ewocs\n" +
           "                                                                           &lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;Capped>N&lt;/Capped>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>HAZ&lt;/NoteType>&lt;NoteText>\n" +
           "                                                                                          No Data Available Via Ewocs\n" +
           "                                                                           &lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;Capped>N&lt;/Capped>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>WAR&lt;/NoteType>&lt;NoteText>\n" +
           "                                                                                          No Data Available Via Ewocs\n" +
           "                                                                           &lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;Capped>N&lt;/Capped>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>FLT&lt;/NoteType>&lt;NoteText>\n" +
           "                                                                                          There are no Technical Notes\n" +
           "                                                                           &lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;Capped>N&lt;/Capped>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>ACC&lt;/NoteType>&lt;NoteText>\n" +
           "                                                                                          There are NO ACCESS Notes\n" +
           "                                                                           &lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;Capped>N&lt;/Capped>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>GEN&lt;/NoteType>&lt;NoteText>\n" +
           "                                                                                          CASE NOTES \n" +
           "\n" +
           "\n" +
           "                                                                           &lt;/NoteText>&lt;NoteAppendInd>FALSE&lt;/NoteAppendInd>&lt;Capped>N&lt;/Capped>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>\n" +
           "                                                                                          FIT\n" +
           "                                                                           &lt;/NoteType>&lt;NoteText>&lt;/NoteText>&lt;NoteAppendInd>\n" +
           "                                                            FALSE\n" +
           "                                             &lt;/NoteAppendInd>&lt;NoteDateTime/>&lt;Capped>N&lt;/Capped>&lt;/TaskNotesDs>&lt;TaskNotesDs>&lt;NoteType>\n" +
           "                                                                                          PRD\n" +
           "                                                                           &lt;/NoteType>&lt;NoteText>&lt;/NoteText>&lt;ProductChanges>&lt;A864SerialNo/>&lt;ChangeDetails>&lt;ProvideCeaseShift/>&lt;ProductDescription/>&lt;ProductQuantity/>&lt;/ChangeDetails>&lt;ChangeDetails>&lt;ProvideCeaseShift/>&lt;ProductDescription/>&lt;ProductQuantity/>&lt;/ChangeDetails>&lt;ChangeDetails>&lt;ProvideCeaseShift/>&lt;ProductDescription/>&lt;ProductQuantity/>&lt;/ChangeDetails>&lt;ChangeDetails>&lt;ProvideCeaseShift/>&lt;ProductDescription/>&lt;ProductQuantity/>&lt;/ChangeDetails>&lt;ChangeDetails>&lt;ProvideCeaseShift/>&lt;ProductDescription/>&lt;ProductQuantity/>&lt;/ChangeDetails>&lt;ChangeDetails>&lt;ProvideCeaseShift/>&lt;ProductDescription/>&lt;ProductQuantity/>&lt;/ChangeDetails>&lt;/ProductChanges>&lt;NoteAppendInd>\n" +
           "                                                                                          FALSE\n" +
           "                                                                           &lt;/NoteAppendInd>&lt;NoteDateTime/>&lt;Capped>N&lt;/Capped>&lt;/TaskNotesDs></FSINotes>\n" +
           "                              <BTNote>\n" +
           "                                             <BTHazardNotes>\n" +
           "                                                                                          No Data Available Via Ewocs\n" +
           "                                             </BTHazardNotes>\n" +
           "                                             <BTGeneralNotes>\n" +
           "                                                                                          CASE NOTES \n" +
           "\n" +
           "\n" +
           "                                             </BTGeneralNotes>\n" +
           "                                             <BTAccessNotes>\n" +
           "                                                                                          There are NO ACCESS Notes\n" +
           "                                             </BTAccessNotes>\n" +
           "                                             <BTLineTestNotes>\n" +
           "                                                                                          No Data Available Via Ewocs\n" +
           "                                             </BTLineTestNotes>\n" +
           "                                             <BTTechnicalNotes>\n" +
           "                                                                                          There are no Technical Notes\n" +
           "                                             </BTTechnicalNotes>\n" +
           "                              </BTNote>\n" +
           "                              <WLR>\n" +
           "                                             <NEOJIN>EO-160349</NEOJIN>\n" +
           "                                             <EMPProductType>COMPLEX</EMPProductType>\n" +
           "                                             <AssureOrFulfill>F</AssureOrFulfill>\n" +
           "                              </WLR>\n" +
           "                              <AddTaskInfo>\n" +
           "                                             <Download>\n" +
           "                                                            <CPName/>\n" +
           "                                                            <CPCntactDetails/>\n" +
           "                                                            <EUName>FIRSTNAME SURNAME</EUName>\n" +
           "                                                            <EUCntactDetails>01908 6248644</EUCntactDetails>\n" +
           "                                                            <EUSecondName/>\n" +
           "                                                            <EUSecondCntactDetails/>\n" +
           "                                                            <RetailerName/>\n" +
           "                                                            <RetailerCntactDetails/>\n" +
           "                                                            <Access24Hr>Y</Access24Hr>\n" +
           "                                                            <ExternalTaskRef>LFSC/E503UG</ExternalTaskRef>\n" +
           "                                             </Download>\n" +
           "                              </AddTaskInfo>\n" +
           "                              <BTWorkId>012987/011</BTWorkId>\n" +
           "                              <BTDSLAMDataPresent>\n" +
           "                                                                                          N\n" +
           "                              </BTDSLAMDataPresent>\n" +
           "                              <BTLineTestBaselineRefDataPresent>\n" +
           "                                                                           N\n" +
           "                              </BTLineTestBaselineRefDataPresent>\n" +
           "                              <AdditionalClosureData>\n" +
           "                                             <NoAccessDateTime/>\n" +
           "                                             <OrderClosureData>\n" +
           "                                                            <OrderBasicDetails>\n" +
           "                                                                           <ExternalWiring/>\n" +
           "                                                                           <InternalWiring/>\n" +
           "                                                                           <ServiceLines/>\n" +
           "                                                                           <ExternalWiringLines/>\n" +
           "                                                                           <InternalWiringLines/>\n" +
           "                                                            </OrderBasicDetails>\n" +
           "                                             </OrderClosureData>\n" +
           "                                             <RepairClosureData>\n" +
           "                                                            <RepairBasicDetails>\n" +
           "                                                                           <TimescaleFormSerialNo/>\n" +
           "                                                            </RepairBasicDetails>\n" +
           "                                                            <RepairCompleteDetails>\n" +
           "                                                                           <FaultClearDetails>\n" +
           "                                                                                          <ProductCode/>\n" +
           "                                                                                          <AdditionalIndicator/>\n" +
           "                                                                                          <POIFields>\n" +
           "                                                                                                         <LineCondition/>\n" +
           "                                                                                                         <A1024No/>\n" +
           "                                                                                                         <PlantAffected/>\n" +
           "                                                                                                         <PlantType/>\n" +
           "                                                                                                         <WorkPointDetails>\n" +
           "                                                                                                                        <WorkPoint/>\n" +
           "                                                                                                                        <Address/>\n" +
           "                                                                                                         </WorkPointDetails>\n" +
           "                                                                                                         <WorkPointDetails>\n" +
           "                                                                                                                        <WorkPoint/>\n" +
           "                                                                                                                        <Address/>\n" +
           "                                                                                                         </WorkPointDetails>\n" +
           "                                                                                          </POIFields>\n" +
           "                                                                           </FaultClearDetails>\n" +
           "                                                            </RepairCompleteDetails>\n" +
           "                                                            <BillingImpFlag/>\n" +
           "                                                            <FaultReportQualifier/>\n" +
           "                                             </RepairClosureData>\n" +
           "                              </AdditionalClosureData>\n" +
           "                              <BTFSITaskTypeId>COMPLEX</BTFSITaskTypeId>\n" +
           "                              <BTIsSubEngineeringTaskPresent>\n" +
           "                                                                           N\n" +
           "                              </BTIsSubEngineeringTaskPresent>\n" +
           "                              <BTTaskEndIndicator>C</BTTaskEndIndicator>\n" +
           "                              <BTCustomerChargeableWorkindicator/>\n" +
           "                              <WMSInstance>WMC96</WMSInstance>\n" +
           "                              <BTHazWarDetailsPresent>\n" +
           "                                                                           N\n" +
           "                              </BTHazWarDetailsPresent>\n" +
           "                              <BTMHWSwitchIndicator>\n" +
           "                                                                                          N\n" +
           "                              </BTMHWSwitchIndicator>\n" +
           "                              <BTBusinessAssetIdCode>L/MAY</BTBusinessAssetIdCode>\n" +
           "                              <BTWorkAddressDs>&lt;BTWorkAddress>&lt;BTWorkAddressPostCode>N10 3AY&lt;/BTWorkAddressPostCode>&lt;/BTWorkAddress></BTWorkAddressDs>\n" +
           "                              <BTTelephoneNumber>012987</BTTelephoneNumber>\n" +
           "                              <BTChecklistDs>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-11&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>What was the result of the initial pair quality test ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Fail]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-13&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did you complete the Base module ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Yes]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-101&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Have you successfully demonstrated connectivity to the NTE ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Yes]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-102&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did all the connections, extensions and DSL filters meet the minimum standards ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Yes]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-105&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Have you conducted a sync test (modem light on) ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Yes]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-10&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did you replace the NTE and why ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[Yes - It was obsolete]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-19&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did you complete the end customer Premises Wiring Module ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[No]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-103&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did you disconnect any end customer wiring to resolve a problem ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[No]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist>&lt;BTChecklist>&lt;BTChkQuestionId>SFI2-20&lt;/BTChkQuestionId>&lt;BTChkQuestionTxt>Did you complete the end customer premises equipment module ?&lt;/BTChkQuestionTxt>&lt;BTChkAnswer>&lt;![CDATA[No]]&gt;&lt;/BTChkAnswer>&lt;/BTChecklist></BTChecklistDs>\n" +
           "                              <BTFieldClientDetails>\n" +
           "                                             <BTClient>Engineer.com</BTClient>\n" +
           "                                             <EMPProductType>COMPLEX</EMPProductType>\n" +
           "                                             <SiebelReference>1-98744212709</SiebelReference>\n" +
           "                                             <BTClientDetailsDs>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTFieldId>2045</BTFieldId>\n" +
           "                                                                           <BTFieldSeqNo>3</BTFieldSeqNo>\n" +
           "                                                                           <BTFieldResponse>&lt;![CDATA[Customer]]&gt;</BTFieldResponse>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTFieldId>2037</BTFieldId>\n" +
           "                                                                           <BTFieldSeqNo>1</BTFieldSeqNo>\n" +
           "                                                                           <BTFieldResponse>&lt;![CDATA[2037.02]]&gt;</BTFieldResponse>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTFieldId>2515</BTFieldId>\n" +
           "                                                                           <BTFieldSeqNo>2</BTFieldSeqNo>\n" +
           "                                                                           <BTFieldResponse>&lt;![CDATA[2515.04]]&gt;</BTFieldResponse>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTDetailType>CS</BTDetailType>\n" +
           "                                             </BTClientDetailsDs>\n" +
           "                                             <BTClientDetailsDs>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTFieldId>1601</BTFieldId>\n" +
           "                                                                           <BTFieldSeqNo>1</BTFieldSeqNo>\n" +
           "                                                                           <BTFieldResponse>&lt;![CDATA[1601.01]]&gt;</BTFieldResponse>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTDetailType>RA</BTDetailType>\n" +
           "                                             </BTClientDetailsDs>\n" +
           "                                             <BTClientDetailsDs>\n" +
           "                                                            <TaskProgressStage>QBC</TaskProgressStage>\n" +
           "                                                            <ClosureMasterFlag>&lt;![CDATA[ON]]&gt;</ClosureMasterFlag>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base43]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3749]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Prior to any work what was the result of the test ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3749.01]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Pass with all green parameters]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[10]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_OFF]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base66]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[4059]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Prior to any work, did you identify any noise on the line or any left in  FTTC jumpers in PCP ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[4059.02]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Yes, noisy]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[11]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base26]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[1602]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[End customer contacted ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[1602.01]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[ Successful call]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[I completed the ring ahead with the end customer %4010.01% and progressed to their premises.]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[0]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base63]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[4000]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[What was the result of final Eclipse / Fast test ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[4000.01]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Pass]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[The test passed on TIME STAMP.]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[28]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base62]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3417]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Where / how did you perform the final Eclipse / FastTest ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3417.03]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[FastTest]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[I performed final FastTest.]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[27]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_OFF]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base60]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3897]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Where did you perform the final XDSL ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3897.03]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Unable to perform]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[26]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base40]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3854]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Where did you do an initial PQT after DeltaR test ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3854.01]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[NTE backplate]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[I performed PQT at the NTE backplate.]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[9]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base29]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3762]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[What did the end customer describe as the primary issue ? ]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3762.02]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Wi-fi]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[End customer informed us of a Wi-fi issue]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[3]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base7]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[755]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Have you completed all the base module activities listed below ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[755.01]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Yes]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[14]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base2]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[750]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Did you replace the NTE ? ]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[750.01]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Yes ¿ obsolete]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[16]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base1]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[749]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Did you get access to the end customer premises (Inc. access to internal comm / equipment rooms) ? ]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[749.01]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Yes]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[I got access to the internal comm / equipment rooms.]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[2]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_OFF]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base32]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3874]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[What was the result of the test ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3874.04]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Unstable connection]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[The connection is not stable on TIME STAMP.]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[5]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base33]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3743]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Prior to any work where did you perform DeltaR / Autoprotective PQT ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3743.06]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Unable to / did not perform (inc. failed provision null line)]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[DeltaR / Autoprotective PQT test not carried out.]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[6]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base35]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3747]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Reason for not performing DeltaR / Autoprotective PQT]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3747.01]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Tester faulty]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[7]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base56]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3835]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Where did you perform the final PQT ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3835.01]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[NTE back plate]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[I performed final PQT at the NTE back plate.]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[24]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base57]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3836]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[What was the result of the final PQT?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3836.01]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Pass]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[The test passed on&lt;&lt; TIME STAMP>>]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[25]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base51]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3755]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Did you complete any HOLD (height / open joints / lids / defects) for quality or maintenance reasons only ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3755.05]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Yes - PCP / SCP upgrade]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[PCP / SCP not faulty but remade connections to protect against future deterioration .]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[20]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base15]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[764]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Did you find or resolve a problem with the end customer equipment ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[764.02]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[No]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[19]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_OFF]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base53]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3891]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Where is the NTE located for this circuit ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3891.08]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Reception]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[21]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_ON]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base14]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[763]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Did you fit an SSFP or done any checks on beyond the NTE ? ]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[763.02]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[No¿]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[17]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_OFF]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base52]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3864]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Which type of NTE is installed on this circuit ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3864.02]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[NTE5C secure]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[22]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>&lt;![CDATA[CP_OFF]]&gt;</BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDInternal>&lt;![CDATA[Base30]]&gt;</BTChkQuestionIDInternal>\n" +
           "                                                                           <BTChkQuestionIDExternal>&lt;![CDATA[3872]]&gt;</BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkQuestionTextExternal>&lt;![CDATA[Where did you carry out the initial XDSL test ?]]&gt;</BTChkQuestionTextExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>&lt;![CDATA[3872.06]]&gt;</BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextInternal>&lt;![CDATA[Modem / router at extension socket]]&gt;</BTChkResponseTextInternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;![CDATA[I performed the initial XDSL test at CP modem / router connected to an extension socket.]]&gt;</BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>&lt;![CDATA[4]]&gt;</BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                             </BTClientDetailsDs>\n" +
           "                                             <BTClientDetailsDs>\n" +
           "                                                            <TaskProgressStage>RA</TaskProgressStage>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>External </BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDExternal>2801 </BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>2801.01 </BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;I completed the ring ahead;gt; </BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>0 </BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                             </BTClientDetailsDs>\n" +
           "                                             <BTClientDetailsDs>\n" +
           "                                                            <TaskProgressStage>EAOS</TaskProgressStage>\n" +
           "                                                            <BTFieldInfo>\n" +
           "                                                                           <BTDetailFlag>External </BTDetailFlag>\n" +
           "                                                                           <BTChkQuestionIDExternal>2272 </BTChkQuestionIDExternal>\n" +
           "                                                                           <BTChkResponseIDExternal>2272.01 </BTChkResponseIDExternal>\n" +
           "                                                                           <BTChkResponseTextExternal>&lt;Out of hours;gt; </BTChkResponseTextExternal>\n" +
           "                                                                           <BTChkResponseSequence>0 </BTChkResponseSequence>\n" +
           "                                                            </BTFieldInfo>\n" +
           "                                             </BTClientDetailsDs>\n" +
           "                              </BTFieldClientDetails>\n" +
           "                              <BTRoutingDetails>\n" +
           "                                             <BTRoutingDs>\n" +
           "                                                            <BTID>021256789</BTID>\n" +
           "                                                            <BTCSSFaultReference>WW9ABC22</BTCSSFaultReference>\n" +
           "                                                            <BTRouting>\n" +
           "                                                                           <BTLineNo>0001</BTLineNo>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>1</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>M</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>456</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>D</BTNodeSideRef>\n" +
           "                                                                                          <BTSubNodeIdRef>H</BTSubNodeIdRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>2</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>P</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>21</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>E</BTNodeSideRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>2</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>P</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>21</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>D</BTNodeSideRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>A2</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>D</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>52</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>E</BTNodeSideRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                            </BTRouting>\n" +
           "                                                            <BTRouting>\n" +
           "                                                                           <BTLineNo>0002</BTLineNo>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>1</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>M</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>456</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>D</BTNodeSideRef>\n" +
           "                                                                                          <BTSubNodeIdRef>H</BTSubNodeIdRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>2</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>P</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>21</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>E</BTNodeSideRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>2</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>P</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>21</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>D</BTNodeSideRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>A2</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>D</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>52</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>E</BTNodeSideRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                            </BTRouting>\n" +
           "                                             </BTRoutingDs>\n" +
           "                                             <BTRoutingDs>\n" +
           "                                                            <BTID>02125678</BTID>\n" +
           "                                                            <BTCSSOrderReference>WW9ABC123/12</BTCSSOrderReference>\n" +
           "                                                            <BTRouting>\n" +
           "                                                                           <BTLineNo>0001</BTLineNo>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>A2</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>M</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>52</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>D</BTNodeSideRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>A2</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>P</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>52</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>E</BTNodeSideRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>A2</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>P</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>52</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>D</BTNodeSideRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                                           <BTNodeDetailsRef>\n" +
           "                                                                                          <BTNodeIdRef>A2</BTNodeIdRef>\n" +
           "                                                                                          <BTNodeCatRef>D</BTNodeCatRef>\n" +
           "                                                                                          <BTTerminationNoRef>52</BTTerminationNoRef>\n" +
           "                                                                                          <BTNodeSideRef>E</BTNodeSideRef>\n" +
           "                                                                           </BTNodeDetailsRef>\n" +
           "                                                            </BTRouting>\n" +
           "                                             </BTRoutingDs>\n" +
           "                              </BTRoutingDetails>\n" +
           "               </FieldSupportInformation>\n" +
           "               <ResourceRequirementsDs>\n" +
           "                              <MinimumResource>2</MinimumResource>\n" +
           "                              <OptimumResource>3</OptimumResource>\n" +
           "                              <MaximumResource>4</MaximumResource>\n" +
           "               </ResourceRequirementsDs>\n" +
           "</TaskDetails>\n";
*//*

    public static String getTagValueFromXML(String inputXML, String xpathExpression) throws Exception {
        String result = null;
        try (StringReader stringReader = new StringReader(inputXML)) {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(stringReader));
            XPath xpath = XPathFactory.newInstance().newXPath();
            NodeList nodeList = (NodeList) xpath.evaluate(xpathExpression, doc, XPathConstants.NODESET);
            if (nodeList.getLength() == 1) {
                result = nodeList.item(0).getTextContent();
            }
        }
        return result;
    }
   public static String getTagList(String tagName, String xml)
   {
      InputSource inputSource = null;
      DocumentBuilderFactory dbFactory = null;
      DocumentBuilder dBuilder = null;
      Document doc = null;
      // HashMap requestParams = null;
      Element eElement = null;
      ArrayList moduleList = null;
      try
      {
         inputSource = new InputSource(new StringReader(xml));
         dbFactory = DocumentBuilderFactory.newInstance();
         dBuilder = dbFactory.newDocumentBuilder();
         doc = dBuilder.parse(inputSource);
         doc.getDocumentElement().normalize();

         NodeList nList = doc.getElementsByTagName("BTFieldClientDetails");
         System.out.println("TaskDetails"+nList);
         int temp = 0;
         Node nNode = nList.item(temp);
         System.out.println("TaskDetails"+nNode);
         if (nNode.getNodeType() == Node.ELEMENT_NODE)
         {
            eElement = (Element) nNode;
            moduleList = new ArrayList();
            NodeList nodeList = eElement.getElementsByTagName(tagName);
            for (int i = 0; i < nodeList.getLength(); i++)
            {
               // get element of orderItem
               Element orderItemElement = (Element) nodeList.item(i);
               Element productName = (Element) orderItemElement.getElementsByTagName("BTFieldClientDetails").item(0);
               System.out.println("BTFieldClientDetails"+productName);
               Element productIdentifier = (Element) productName.getElementsByTagName("BTClientDetailsDs").item(0);
               NodeList productChilds = productIdentifier.getElementsByTagName("TaskProgressStage");
               // get name from product name

               Node nodeValue = (Node) productChilds.item(0).getFirstChild();
               if (nodeValue != null)
               {
                  String tagValue = null;
                  tagValue = nodeValue.getNodeValue();
                  return tagValue;
                 */
/* if (tagValue != null)
                  {
                     tagValue = tagValue.trim();
                     moduleList.add(tagValue);
                  }*//*

               }
            }
         }
      }
      catch (Exception e)
      {
      }
      finally
      {
         inputSource = null;
         dbFactory = null;
         dBuilder = null;
         doc = null;
      }

      return null;
   }

    public static void main(String args[]){
        */
/*try {

           String tagValueForTaskProgressStage = TestXMLTag.getTagList("BTClientDetailsDs",gftXml);
           System.out.println("tagValueForTaskProgressStage"+tagValueForTaskProgressStage);

           // String tagValueForTaskProgressStage = TestXMLTag.getTagList("/TaskDetails/BTFieldClientDetails/BTClientDetailsDs/TaskProgressStage",gftXml);
           System.out.println("tagValueForTaskProgressStage"+gftXml.contains("<TaskProgressStage>QBF</TaskProgressStage>"));

           String taskCategory = TestXMLTag.getTagValueFromXML(gftXml,"/TaskDetails/TaskPreview/TaskCategory");
            System.out.println("taskCategory "+taskCategory);
        } catch (Exception e) {
            e.printStackTrace();
        }*//*


       try{
         gftXml = gftXml.replace("<!DOCTYPE TaskDetails SYSTEM \"WorkMgtReception_getFullTaskResponse.dtd\">","");
          InputSource inputSource =new InputSource(new StringReader(gftXml));
          DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
          DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
          Document doc = dBuilder.parse(inputSource);
          doc.getDocumentElement().normalize();

          NodeList nList = doc.getElementsByTagName("TaskDetails");
          System.out.println("Size-"+nList.getLength());
          int temp = 0;
          Node nNode = nList.item(temp);

          if (nNode.getNodeType() == Node.ELEMENT_NODE){
             Element eElement = (Element) nNode;
             List list = new ArrayList();
             NodeList nodeList = eElement.getElementsByTagName("BTClientDetailsDs");
             for (int i = 0; i < nodeList.getLength(); i++)
             {

                Element checkList = (Element) nodeList.item(i);
                if(checkList.getElementsByTagName("TaskProgressStage").getLength()>0){
                   Node  l=checkList.getElementsByTagName("TaskProgressStage").item(0);
                   System.out.println(l.getFirstChild().getNodeValue());
                   list.add(l.getFirstChild().getNodeValue());
                }

             }
             boolean isContains = list.contains("QBC");
             System.out.println("isContains"+isContains);
          }
       }
       catch (Exception e)
       {
          System.out.println("Exception occured-"+e);
       }


    }

    }

*/
