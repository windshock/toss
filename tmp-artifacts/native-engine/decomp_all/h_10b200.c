// entry=0x10b200

void H10b200(ulong param_1)

{
  bool bVar1;
  ulong uVar2;
  char cVar3;
  uint uVar4;
  uint in_w10;
  ulong uVar5;
  uint uVar6;
  long lVar7;
  long unaff_x19;
  undefined4 unaff_w26;
  long unaff_x29;
  
  *(byte *)(*(long *)(unaff_x29 + -0x88) + param_1) =
       (-(char)DAT_00280ba0 & 0x7fU | 0x73) * '\x02' - (-(char)DAT_00280ba0 ^ 0x73U);
  if (param_1 <= (-DAT_00280ba0 ^ 0x915e2a01960349c4U) + (-DAT_00280ba0 & 0x915e2a01960349c4U) * 2)
  {
    lVar7 = -0x6ea1d5fe69fcb6ba - (-DAT_00280ba0 ^ 0xffffffffffffffffU);
    uVar6 = *(uint *)(unaff_x29 + -0xac);
    do {
      uVar4 = 0;
      if (in_w10 != 0) {
        uVar4 = uVar6 / in_w10;
      }
      *(undefined1 *)(unaff_x19 + lVar7 + -1) =
           (&DAT_0027ad10)[(uVar6 | -(uVar4 * in_w10)) + (uVar6 & -(uVar4 * in_w10))];
      lVar7 = lVar7 + 1;
      bVar1 = in_w10 <= uVar6;
      uVar6 = uVar4;
    } while (bVar1);
    if ((param_1 ^ 1) + (param_1 & 1) * 2 <
        (-DAT_00280ba0 | 0x915e2a01960349c6U) + (-DAT_00280ba0 & 0x915e2a01960349c6U)) {
                    /* WARNING: Could not recover jumptable at 0x00208bd8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&PTR_H108924_0027fdb8)
                [(long)(int)(-0x69fcb6bb - (-(int)DAT_00280ba0 ^ 0xffffffffU)) * 99])();
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x0020c350. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00282bd8)();
    return;
  }
LAB_0020bdac:
  do {
    if (DAT_00286250 == 0) {
      cVar3 = '\x01';
      bVar1 = (bool)ExclusiveMonitorPass(0x286250,0x10);
      if (bVar1) {
        DAT_00286250 = 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
      if (cVar3 != '\0') goto LAB_0020bdac;
      bVar1 = true;
    }
    else {
      ClearExclusiveLocal();
      bVar1 = false;
    }
    if (bVar1) {
      uVar5 = (-DAT_00280ba0 | 0x915e2a0196034946U) + (-DAT_00280ba0 & 0x915e2a0196034946U);
      if (-(uint)((DAT_00274f30 & 1) == 0) == -(-((uint)DAT_00280ba0 & 1) & 1)) {
        do {
          uVar2 = (-DAT_00280ba0 ^ 0x915e2a0196034947U) + (-DAT_00280ba0 & 0x915e2a0196034947U) * 2;
          uVar5 = (uVar5 | uVar2) + (uVar5 & uVar2);
        } while (uVar5 != 0x915e2a0196034950 - (-DAT_00280ba0 ^ 0xffffffffffffffffU));
                    /* WARNING: Could not recover jumptable at 0x0020985c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00278c90)();
        return;
      }
      DAT_00286250 = 0;
      lVar7 = *(long *)(unaff_x29 + -0x88);
      *(undefined1 *)(lVar7 + 0x7f) = 0;
      CallSupervisor(0);
      CallSupervisor(0);
      if ((int)lVar7 < 1) {
        if ((*(uint *)(unaff_x29 + -0x13c) & 1) != 0) {
          DAT_0028623c = unaff_w26;
                    /* WARNING: Could not recover jumptable at 0x002082b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR_LAB_00281840)(lVar7,&DAT_00282fd8);
          return;
        }
                    /* WARNING: Could not recover jumptable at 0x00209e4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00282d68)(1);
        return;
      }
                    /* WARNING: Could not recover jumptable at 0x0020c428. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00274468)();
      return;
    }
  } while( true );
}


