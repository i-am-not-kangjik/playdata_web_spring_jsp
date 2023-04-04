<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    h1 {
        text-align: center;
    }

    /* 테이블 가운데 정렬 */
    table {
        margin: 0 auto;
        border-collapse: collapse; /* 테두리를 하나로 합침 */
        border-top: 1px solid black; /* 가장 위쪽 테두리 */
        border-bottom: 1px solid black; /* 가장 아래쪽 테두리 */
    }

    /* 셀 높이 조절 */
    td, th {
        height: 30px;
    }

    table td,
    table th {
         border: 1px black dotted;
    }

    table th:first-child,
    table td:first-child {
        border-left: 0;
    }

    table th:last-child,
    table td:last-child {
        border-right: 0;
    }

    .highlight {
        background-color: rgb(229, 229, 229);
    }

</style>

</style>
</head>
<body>
    <h1>이 력 서</h1>
    <table>
        <colgroup>
            <col style="width:100px; height: 100px;">
            <col style="width:100px;">
            <col style="width:200px;">
            <col style="width:100px;">
            <col style="width:200px;">
        </colgroup>
        <tr>
            <th rowspan="5">사진</th>
            <th class="highlight">성명</th>
            <td></td>
            <th class="highlight">영문이름</th>
            <td></td>
        </tr>
        <tr>
            <th class="highlight">주소</th>
            <td colspan="3"></td>
        </tr>
        <tr>
            <th class="highlight">E-mail</th>
            <td colspan="3"></td>
        </tr>
        <tr>
            <th class="highlight">연 락 처</th>
            <td></td>
            <th class="highlight">휴대폰</th>
            <td></td>
        </tr>
        <tr>
            <th class="highlight">현 주 소</th>
            <td colspan="3"></td>
        </tr>
    </table>
    <p></p>
    <table>
        <col style="width:50px;">
        <col style="width:100px;">
        <col style="width:125px;">
        <col style="width:100px;">
        <col style="width:125px;">
        <col style="width:100px;">
        <col style="width:100px;">
        <tr>
            <th rowspan="4" class="highlight">학력</th>
            <th class="highlight">졸업연월</th>
            <th class="highlight">학 교 명</th>
            <th class="highlight">졸업구분</th>
            <th class="highlight">전 공</th>
            <th class="highlight">석 차</th>
            <th class="highlight">비 고</th>
        </tr>
        <tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr><tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr><tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
    </table><p></p>
    <table>
        <col style="width:50px;">
        <col style="width:125px;">
        <col style="width:125px;">
        <col style="width:125px;">
        <col style="width:50px;">
        <col style="width:225px;">
        <tr>
            <th rowspan="4" class="highlight">경력</th>
            <th colspan="2" class="highlight">근무기간</th>
            <th class="highlight">근무처</th>
            <th class="highlight">직위</th>
            <th class="highlight">담 당 직 무</th>
        </tr>
        <tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr><tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr><tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
    </table><p></p>
    <table>
        <col style="width:50px;">
        <col style="width:125px;">
        <col style="width:150px;">
        <col style="width:50px;">
        <col style="width:75px;">
        <col style="width:150px;">
        <col style="width:100px;">
        <tr>
            <th rowspan="6" class="highlight">자격 및 교육 사항</th>
            <th class="highlight">취득일자</th>
            <th class="highlight">자격 및 교육명</th>
            <th class="highlight">등급</th>
            <th class="highlight">취득일자</th>
            <th class="highlight">자격 및 교육명</th>
            <th class="highlight">비 고</th>
        </tr>
        <tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
        <tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
        <tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
        <tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
        <tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr>
    </table><p></p>
    <table>
        <col style="width:50px;">
        <col style="width:100px;">
        <col style="width:100px;">
        <col style="width:200px;">
        <col style="width:50px;">
        <col style="width:200px;">
        <tr>
            <th rowspan="4" class="highlight">해외 연수</th>
            <th class="highlight">국가</th>
            <th class="highlight">기간</th>
            <th class="highlight">목적</th>
            <th rowspan="3" class="highlight">상벌사항</th>
            <th></th>
        </tr>
        <tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr><tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
    </table>
</body>
</html>