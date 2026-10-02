// entry=0x84254

void H84254(void)

{
  uint uVar1;
  int iVar2;
  bool bVar3;
  byte *unaff_x24;
  
  uVar1 = -(uint)((*unaff_x24 & 1) != 0);
  iVar2 = (DAT_0029e3ac | uVar1) * 2 - (DAT_0029e3ac ^ uVar1);
  bVar3 = DAT_0029e3ac ==
          (-(int)DAT_00274480 | 0x94f8c2f3U) * 2 - (-(int)DAT_00274480 ^ 0x94f8c2f3U);
  DAT_0029e3ac = iVar2;
  if (((bVar3 ^ *unaff_x24 & 1 ^ 1) & bVar3) != 0) {
    memset(&DAT_0027cf50,0,8);
  }
  DAT_0029e780 = 0;
                    /* WARNING: Could not recover jumptable at 0x0017a5b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002796e0)();
  return;
}


