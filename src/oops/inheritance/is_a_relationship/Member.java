package oops.inheritance.is_a_relationship;

public class Member {

    private String memberId;
    private String memberName;
    private String memberEmail;

    public Member(String memberId, String memberName, String memberEmail){
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
    }

    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId){
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }
}
