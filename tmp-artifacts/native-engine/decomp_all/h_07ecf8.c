// entry=0x7ecf8

void H7d53c(void)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar2 | 0x94f8c2f2) + (uVar2 & 0x94f8c2f2)) * 300 +
             (long)(int)((uVar1 | 0x94f8c407) + (uVar1 & 0x94f8c407))])
            ((-DAT_00274480 | 0x99bbd15a94f8c2f3U) + (-DAT_00274480 & 0x99bbd15a94f8c2f3U));
                    /* WARNING: Could not recover jumptable at 0x0017d5d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00279298)();
  return;
}


