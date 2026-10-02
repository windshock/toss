// entry=0x68e00

void H68e00(void)

{
  int *piVar1;
  undefined **ppuVar2;
  ushort uVar3;
  ulong uVar4;
  code *UNRECOVERED_JUMPTABLE;
  ushort *in_x13;
  int *in_x14;
  undefined8 *in_x15;
  int *in_x16;
  uint uVar5;
  ushort *unaff_x22;
  int iVar6;
  long unaff_x29;
  
  *(uint *)(unaff_x29 + -0xac) = (uint)(0 < *(int *)(unaff_x29 + -0x70));
  uVar5 = (-(int)DAT_00276dd0 | 0xa761abe9U) * 2 - (-(int)DAT_00276dd0 ^ 0xa761abe9U);
  iVar6 = 1;
  *(ushort **)(unaff_x29 + -0x78) = in_x13;
  *(int **)(unaff_x29 + -0x80) = in_x14;
  do {
    *(int *)(unaff_x29 + -0xb4) = iVar6;
    uVar4 = ((long)in_x16 << 1 | 0x5cU) - ((ulong)in_x16 ^ 0x2e);
    uVar3 = *(ushort *)(in_x16 + 7);
    uVar4 = (ulong)uVar3 +
            ((uVar4 | *(ushort *)((long)in_x16 + 0x1e)) * 2 -
            (uVar4 ^ *(ushort *)((long)in_x16 + 0x1e)));
    piVar1 = (int *)((uVar4 ^ *(ushort *)(in_x16 + 8)) + (uVar4 & *(ushort *)(in_x16 + 8)) * 2);
    *in_x14 = 0;
    in_x14[1] = 0;
    iVar6 = -((int)DAT_00276dd0 + 1U & 1);
    if (*in_x16 == 0x2014b50) {
      *in_x14 = in_x16[6];
      ppuVar2 = &PTR_H68600_0027d3d8;
      if (uVar3 <= *unaff_x22) {
        ppuVar2 = &PTR_LAB_0027f470;
      }
      UNRECOVERED_JUMPTABLE = (code *)*ppuVar2;
      *(int **)(unaff_x29 + -0xa8) = piVar1;
      *(uint *)(unaff_x29 + -0xb0) = uVar5;
                    /* WARNING: Could not recover jumptable at 0x0016a0a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*UNRECOVERED_JUMPTABLE)();
      return;
    }
    uVar5 = (uVar5 | 1) * 2 - (uVar5 ^ 1);
    in_x16 = piVar1;
  } while (uVar5 < *in_x13);
                    /* WARNING: Could not recover jumptable at 0x0016869c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002743f8)(*in_x15);
  return;
}


